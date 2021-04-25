package sanji;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jxy on 2021/4/24 0024 15:02
 */
public class AQSDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        //带入一个银行办理业务的案例模拟我们的AQS
        new Thread(()->{
            lock.lock();
            try {
                System.out.println("A Thread come in");
                try {
                    TimeUnit.MINUTES.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }finally {
                lock.unlock();
            }
        },"A").start();
        //第二个顾客 进入候客区
        new Thread(()->{
            lock.lock();
            try {
                System.out.println("-----B thread come in");
            }finally {
                lock.unlock();
            }
        },"B").start();

        //第三个顾客 进入候客区
        new Thread(()->{
            lock.lock();
            try {
                System.out.println("-----C thread come in");
            }finally {
                lock.unlock();
            }
        },"C").start();

    }
}
