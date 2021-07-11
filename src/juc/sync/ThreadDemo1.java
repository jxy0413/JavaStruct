package juc.sync;

/**
 * @author jiaxiangyu
 * @date 2021/7/11 4:07 下午
 */
public class ThreadDemo1 {

  public static void main(String[] args) {
    Share share = new Share();
    new Thread(()->{
       for(int i=1;i<=10 ;i++){
          share.incy();
       }
    },"AA").start();

    new Thread(()->{
      for(int i=1;i<=10 ;i++){
        share.decy();
      }
    },"BB").start();
  }
}
//创建一个资源类，定义属性和操作方法
class Share{
  private int number = 0;

  public synchronized void incy(){
    //第二步
    while (number != 0){
      try {
        this.wait(); //在哪里睡 就在哪里醒
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    number++;
    System.out.println(Thread.currentThread().getName()+" :: "+number);
    //通知其他线程
    this.notifyAll();
  }

  public synchronized void decy(){
    while (number != 1) {
      try {
        this.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    number--;
    System.out.println(Thread.currentThread().getName()+" :: "+number);
    this.notifyAll();
  }
}