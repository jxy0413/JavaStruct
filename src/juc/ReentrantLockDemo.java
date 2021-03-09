package juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/9 11:00
 */
public class ReentrantLockDemo {
    public static void main(String[] args) {
       Mobile mobile = new Mobile();
       new Thread(mobile).start();
       new Thread(mobile).start();
    }
}
class Mobile implements Runnable{
    Lock lock = new ReentrantLock();
    
    @Override
    public void run() {
        get();
    }
    
    public void get(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+"\t invoked get()");
            set();
        }finally {
            lock.unlock();
        }
    }
    
    public void set(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+"\t invoked set()");
        }finally {
            lock.unlock();
        }
    }
}