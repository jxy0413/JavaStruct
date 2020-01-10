package duoxiancheng;

/**
 * Created by jxy on 2020/1/5.
 * 多线程的创建 方式一 ：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run()
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 * 例子 遍历 1-100
 */
class MyThread extends Thread{
    @Override
    public void run() {
         for(int i=0;i<100;i++){
             if(i%2==0){
                 System.out.println(i);
             }
         }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        MyThread t1 = new MyThread();

        //4. 通过此对象调用start() : ①启动当前线程 ② 调用当前线程的run
        //问题一：我们不能直接调用run()
        t1.start();
        //问题二：我们不能直接调用start()去执行 会报IllegalThreadStateException
        MyThread t2 = new MyThread();
        t2.start();
        //如下操作仍然是main线程执行的
        for(int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }
    }
}
