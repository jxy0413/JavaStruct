package juc;

/**
 * @author jiaxiangyu
 * @date 2021/7/11 11:35 上午
 * 主线程结束了，用户线程还在运行，jvm存活
 * 没有用户线程，都是守护线程，jvm结束
 */
public class Daemon {

  public static void main(String[] args) {
    Thread aa = new Thread(() -> {
      System.out
          .println(Thread.currentThread().getName() + "::" + Thread.currentThread().isDaemon());
      while (true) {

      }
    }, "aa");
    //设置守护线程
    aa.setDaemon(true);
    aa.start();
    System.out.println(Thread.currentThread().getName()+" over");
  }
}
