package sanji;

/**
 * Created by jxy on 2021/4/23 0023 16:41
 */
public class SynDemo {
    static Object objectLock = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (objectLock){
                System.out.println(Thread.currentThread().getName()+"\t"+"----come in");
                try {
                    objectLock.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"\t 被唤醒");
            }
        },"AAA").start();

        new Thread(()->{
           synchronized (objectLock){
               objectLock.notify();
               System.out.println(Thread.currentThread().getName()+"\t ----通知");
           }
        },"BBB").start();
    }
}
