package juc;

import java.util.concurrent.atomic.AtomicInteger;

class Mydata{
    volatile int  data = 0;

    public void addData(){
        this.data = 60;
    }

    //此时data前面是加了volatile修饰的
    public  void addPlusPlus(){
        data++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();

    public void addAutomic(){
        atomicInteger.getAndIncrement();
    }
}

/**
 * 1、验证volatile的可见性
 *    1、1 假如int number = 0; number变量之前根本没有添加volatile关键字修饰
 * 2、验证volatile不保证原子性
 *   2.1 原子性指的是什么意思？
 *       不可分割，完整性，也即某个线程正在做具体业务，中间不可以分割或者加塞，需要整体完成
 *       要么同时成功，要么同时失败
 *   2.2 volatile是否可以保证原子性？
 *   2.3 为什么不能保证synchronized
 *   2.4
 *       如果解决原子性
 *           使用juc下的Automic
 *
 */
public class VolatileDemo {
    public static void main(String[] args) {
          Mydata mydata = new Mydata();

          for(int i=0;i<20;i++){
              new Thread(()->{
                   for(int j=1;j<=1000;j++){
                       mydata.addPlusPlus();
                       mydata.addAutomic();
                   }
              },String.valueOf(i)).start();
          }
          //需要等待上面20个线程全部计算完成后，再用main线程得到最终的结果值
          while (Thread.activeCount()>2){
              Thread.yield();
          }
          System.out.println(Thread.currentThread().getName()+" : "+mydata.data);
          System.out.println(Thread.currentThread().getName()+" : "+mydata.atomicInteger);
    }

    public static void seeOkByVolatile(){
        Mydata mydata = new Mydata();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t come in");
            try {
                Thread.sleep(3000);
                mydata.addData();
                System.out.println(Thread.currentThread().getName()+"\t updated number value "+mydata.data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AAA").start();
        //第二个线程就是我们的main线程
        while (mydata.data==0){
            //main线程一直在
        }
        System.out.println(Thread.currentThread().getName()+"\t"+"miss is over");
    }
}
