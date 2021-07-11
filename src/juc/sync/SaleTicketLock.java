package juc.sync;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jiaxiangyu
 * @date 2021/7/11 12:16 下午
 */
public class SaleTicketLock {

  public static void main(String[] args) {
    LTicket ticket = new LTicket();

    new Thread(()->{
           for(int i=0 ; i< 40; i++){
             ticket.sale();
           }
    },"AA").start();

    new Thread(()->{
      for(int i=0 ; i< 40; i++){
        ticket.sale();
      }
    },"BB").start();

    new Thread(()->{
      for(int i=0 ; i< 40; i++){
        ticket.sale();
      }
    },"CC").start();
  }
}
class LTicket{
  private int number = 30;
  private final ReentrantLock lock = new ReentrantLock();
  //卖票方法
  public void sale(){
    //上锁
    lock.lock();
    try {
      if(number > 0){
        System.out.println(Thread.currentThread().getName()+ " 卖出 "+(number--)+"剩余"+number);
      }
    }finally {
      lock.unlock();
    }
  }
}
