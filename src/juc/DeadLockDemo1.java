package juc;

import java.util.concurrent.TimeUnit;

/**
 * Created by jxy on 2021/4/10 0010 13:00
 */
class HoldLockThread implements Runnable{
     private String lockA;
     private String lockB;

    public HoldLockThread(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName()+"\t自己持有："+lockA+"尝试获得："+lockB);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName()+"\t自己持有："+lockB+"尝试获得："+lockA);
            }
        }
    }
}
public class DeadLockDemo1 {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new HoldLockThread(lockA,lockB),"AAA").start();
        new Thread(new HoldLockThread(lockB,lockA),"BBB").start();
        /**
         * linux ps -ef|grep xxxx
         * windows下的java运行程序 也有类似ps的查看进程的命令  但是目前我们需要查看的只是java
         * jps = jps -l
         * jstack
         */
    }
}
