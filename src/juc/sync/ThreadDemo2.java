package juc.sync;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jiaxiangyu
 * @date 2021/7/11 9:12 下午
 */
class ShareLock{
  private int number = 0;

  private Lock lock = new ReentrantLock();

  private Condition condition = lock.newCondition();

  public void incy(){
    //上锁
    lock.lock();
    try {
      //判断
      while (number!=0){
        try {
          condition.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      number++;
      System.out.println(Thread.currentThread().getName()+" : "+number);
      condition.signalAll();
    }finally {
      //解锁
      lock.unlock();
    }
  }

  public void decy(){
    //上锁
    lock.lock();
    try {
      //判断
      while (number==0){
        try {
          condition.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      number--;
      System.out.println(Thread.currentThread().getName()+" : "+number);
      condition.signalAll();
    }finally {
      //解锁
      lock.unlock();
    }
  }
}
public class ThreadDemo2 {

  public static void main(String[] args) {
    ShareLock lock = new ShareLock();
    new Thread(()->{
       for(int i=0;i<10;i++){
         lock.incy();
       }
    },"AA").start();

    new Thread(()->{
      for(int i=0;i<10;i++){
        lock.decy();
      }
    },"BB").start();
  }
}
