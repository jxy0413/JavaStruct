package juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/5 10:26
 */
public class VolatileDemo1 {
    public static void main(String[] args) {
        //visibilityByVolatile();
        atomicByVolatile();
    }

    public static void visibilityByVolatile(){
        MyData1 myData = new MyData1();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t come in");
            try {
                TimeUnit.SECONDS.sleep(3);
                myData.addToSixty();
                System.out.println(Thread.currentThread().getName()+"\t update value\t"+myData.num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"thread1").start();
        //第二个线程是main线程
        while (myData.num==0){
            //如果myData的num一直为零，main线程一直在循环
            System.out.println("循环中");
        }
        System.out.println(Thread.currentThread().getName()+"\t mission is over,num value is "+myData.num);
    }

    /**
     * volatile不保证原子性
     */
    public static void atomicByVolatile(){
        MyData1 mydata = new MyData1();
        for(int i=1;i<21;i++){
            new Thread(()->{
                 for(int j=1;j<=1000;j++){
                     mydata.addSelf();
                     mydata.atomicAddSelf();
                 }
            },"Thread"+i).start();
        }
        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"\t finally num value is "+mydata.num);
        System.out.println(Thread.currentThread().getName()+"\t finally num value is "+mydata.atomicInteger);
    }

}
class MyData1{
    int num = 0;

    public void addToSixty(){
        this.num = 60;
    }

    public void addSelf(){
        num++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();
    public void atomicAddSelf(){
        atomicInteger.getAndIncrement();
    }
}