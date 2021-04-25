package sanji;

/**
 * Created by jxy on 2021/4/23 0023 16:14
 */
public class ReEntryLockDemo {
    static Object objectLockA = new Object();

    public static void m1(){
        new Thread(()->{
            synchronized (objectLockA){
                System.out.println(Thread.currentThread().getName()+"\t 外层调用");
                synchronized (objectLockA){
                    System.out.println(Thread.currentThread().getName()+"\t 中层调用");
                }
            }
        },"t1").start();
    }

    public static void main(String[] args) {
        m1();
    }
}
