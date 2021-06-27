package changkao;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jiaxiangyu
 * @date 2021/6/6 1:38 下午
 * 1.1 保证可见性
 * 1.2 不保证原子性
 * 1.3 禁止指令重排
 */
public class VolatileDemo {
  /**
   * 验证volatile的可见性
   * 1、1 添加volatile可以解决可见性的问题
   * @param args
   */
  public static void main(String[] args) {
//      MyData myData = new MyData(); //资源类
//      new Thread(()->{
//        System.out.println(Thread.currentThread().getName()+"\t come in");
//        try {
//          TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//          e.printStackTrace();
//        }
//        myData.addTo60();
//        System.out.println(Thread.currentThread().getName()+"\t updated number value: "+myData.number);
//      },"AAA").start();
//
//      while (myData.number == 0){
//        //main线程就一直等待循环，直到number不再等于0
//        //System.out.println("xunhuanzhong......");
//      }
//      System.out.println(Thread.currentThread().getName()+"\t mission is over");
    /**
     * 为什么volatile不保证原子性
     * 多个线程会覆盖
     * 如果解决原子性
     *    加sync
     */
    MyData myData = new MyData();
        for(int i=0; i<20;i++){
          new Thread(()->{
             for(int j=0;j<1000;j++){
               myData.addPlusPuls();
               myData.addAtomic();
             }
          },String.valueOf(i+1)).start();
        }
        //需要等待上面20线程
        while (Thread.activeCount() > 2){
          Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"\t finally number value: " + myData.number);
        System.out.println(Thread.currentThread().getName()+"\t finally number value: " + myData.atomicInteger);
  }
}

class MyData{  //Mydata.java ---> Mydata.class ----> jvm
  volatile int number = 0;

  public void addTo60(){
    this.number = 60;
  }

  public void  addPlusPuls(){
    number++;
  }

  AtomicInteger atomicInteger = new AtomicInteger(0);

  public void addAtomic(){
    atomicInteger.getAndIncrement();
  }
}