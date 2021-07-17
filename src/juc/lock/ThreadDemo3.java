package juc.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jiaxiangyu
 * @date 2021/7/11 9:46 下午
 */
public class ThreadDemo3 {

  public static void main(String[] args) {

  }
}
//创建资源类
class ShareResource{
  //定义标志位
  private int flag = 1; //1 AA 2 BB 3 CC
  //创建Lock锁
  private Lock lock = new ReentrantLock();
  //创建三个condition
  private Condition c1 = lock.newCondition();
  private Condition c2 = lock.newCondition();
  private Condition c3 = lock.newCondition();

  //打印五次
  public void print5(int loop){
    //上锁
    lock.lock();
    try {
        //判断
        while (flag != 1){
          try {
            c1.await();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      for(int i=1;i<=5 ;i++){
        System.out.println(Thread.currentThread().getName()+" :: " + i +" 轮数 " + loop);
      }
      //通知
      flag = 2;
      c1.signalAll();
    }finally {
      lock.unlock();
    }
  }

  public void print10(int loop){
    //上锁
    lock.lock();
    try {
      //判断
      while (flag != 2){
        try {
          c1.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      for(int i=1;i<=10 ;i++){
        System.out.println(Thread.currentThread().getName()+" :: " + i +" 轮数 " + loop);
      }
      //通知
      flag = 3;
      c1.signalAll();
    }finally {
      lock.unlock();
    }
  }

  public void print15(int loop){
    //上锁
    lock.lock();
    try {
      //判断
      while (flag != 2){
        try {
          c1.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      for(int i=1;i<=15 ;i++){
        System.out.println(Thread.currentThread().getName()+" :: " + i +" 轮数 " + loop);
      }
      //通知
      flag = 1;
      c1.signalAll();
    }finally {
      lock.unlock();
    }
  }

}