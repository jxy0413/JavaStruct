package sanji;

import java.util.concurrent.locks.LockSupport;

/**
 * Created by jxy on 2021/4/24 0024 14:29
 */
public class LockSupportDemo {
    public static void main(String[] args) {
        Thread a = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t ---come in");
            LockSupport.park();  //被阻塞....等待通知
            System.out.println(Thread.currentThread().getName()+"\t ---被唤醒");
        },"a");
        a.start();

        new Thread(()->{
            LockSupport.unpark(a);
            System.out.println(Thread.currentThread().getName()+"\t ---通知了");
        },"b").start();
    }
}
