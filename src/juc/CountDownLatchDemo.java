package juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/9 14:54
 */
public class CountDownLatchDemo {
    public static void general(){
        for(int i=1;i<=6;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"\t上完自习，离开教室");
            },"Thread-->"+i).start();
        }
        while (Thread.activeCount()>2){
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"\t====班长最后关门走人");
    }
    
    public static void countDownLatchTest() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for(int i = 1;i<=6;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"\t被灭");
                countDownLatch.countDown();
            },Thread.currentThread().getName()).start();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+"\t====秦统一");
    }
    public static void main(String[] args) {
        //general();
        try {
            countDownLatchTest();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
