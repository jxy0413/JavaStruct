package sanji;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jxy on 2021/4/23 0023 22:14
 */
public class LockDemo {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    public static void main(String[] args) {
        new Thread(()->{
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName()+"\t ---come in");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"\t ---被唤醒");
            }finally {
                lock.unlock();
            }
        },"AA").start();

        new Thread(()->{
            lock.lock();
            try {
                condition.signal();
                System.out.println(Thread.currentThread().getName()+"\t ---通知");
            }finally {
                lock.unlock();
            }
        },"BB").start();
    }
}
