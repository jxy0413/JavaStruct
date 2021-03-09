package juc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/9 14:36
 */
public class ReadWriteLockDemo {
    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        for (int i = 1; i <= 5; i++) {
            final int tempInt = i;
            new Thread(() -> {
                myCache.put(tempInt + "", tempInt + "");
            }, "Thread " + i).start();
        }
        for (int i = 1; i <= 5; i++) {
            final int tempInt = i;
            new Thread(() -> {
                myCache.get(tempInt + "");
            }, "Thread " + i).start();
        }
    }
}
class MyCache{
    private volatile Map<String,Object> map = new HashMap<>();
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    
    public void put(String key,Object obj){
        rwLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"\t正在写入"+key);
            TimeUnit.MILLISECONDS.sleep(300);
            map.put(key,obj);
            System.out.println(Thread.currentThread().getName()+"\t写入完成");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            rwLock.writeLock().unlock();
        }
    }
    
    public void get(String key){
        rwLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"\t正在读取: "+key);
            TimeUnit.MILLISECONDS.sleep(300);
            Object result = map.get(key);
            System.out.println(Thread.currentThread().getName()+"\t读取完成: "+result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            rwLock.readLock().unlock();
        }
    }
}