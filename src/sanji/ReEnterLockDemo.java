package sanji;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jxy on 2021/4/23 0023 16:18
 */
public class ReEnterLockDemo {
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        new Thread(()->{
              lock.lock();
              try {
                  System.out.println("=====外层");
                  lock.lock();
                  System.out.println("=====内层");
                  lock.unlock();
              }catch (Exception e){
                  e.printStackTrace();
              }
              finally {
                  lock.unlock();
              }
        },"t1").start();
    }
}
