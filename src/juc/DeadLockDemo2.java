package juc;

import lombok.Synchronized;

import java.util.concurrent.TimeUnit;

/**
 * Created by jxy on 2021/4/10 0010 13:14
 */
class MyDeadLock implements Runnable{
    private String lockA;
    private String lockB;

    public MyDeadLock(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized(lockA){
            System.out.println(Thread.currentThread().getName()+"占有锁");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName()+"尝试占有锁");
            }
        }
    }
}

public class DeadLockDemo2 {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new MyDeadLock(lockA,lockB),"AAA").start();
        new Thread(new MyDeadLock(lockB,lockA),"BBB").start();
    }
}
