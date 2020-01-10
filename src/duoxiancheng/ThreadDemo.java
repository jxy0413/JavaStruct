package duoxiancheng;

/**
 * Created by jxy on 2020/1/5.
 * 联系 ：创建两个分线程 一个线程遍历100以内偶数 一个线程遍历100以内奇数
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println("Thread1 ..."+i);
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println("Thread2 ..."+i);
            }
        }
    }
}