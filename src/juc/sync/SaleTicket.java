package juc.sync;

/**
 * @author jiaxiangyu
 * @date 2021/7/11 11:54 上午
 */
public class SaleTicket {

  public static void main(String[] args) throws InterruptedException {
    //第二步 多个线程调用资源类钿操作方法
    Ticket ticket = new Ticket();
    //创建3个线程
    new Thread(new Runnable() {
      @Override
      public void run() {
         for(int i=0;i<30;i++){
           ticket.saleTicket();
         }
      }
    },"aa").start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i=0;i<30;i++){
          ticket.saleTicket();
        }
      }
    },"bb").start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i=0;i<30;i++){
          ticket.saleTicket();
        }
      }
    },"cc").start();
  }
}
//第一步，创建资源类，定义属性和操作方法
class Ticket{
  private int number = 30;

  public synchronized void saleTicket(){
      if(number>0){
        System.out.println(Thread.currentThread().getName()+" : 卖出："+ number--+"剩下： "+number);
      }
  }
}