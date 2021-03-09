package juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/9 9:43
 * 多线程中，第三种获取多线程的方式
 */
public class CallableDemo {
    public static void main(String[] args) {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread2());
        new Thread(futureTask,"AAA").start();
        int a = 100;
        int b= 0;
        while (!futureTask.isDone()){
            try {
                b = futureTask.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("resulta: "+a);
        System.out.println("resultb: "+b);
    }
}
class MyThread implements Runnable{
    @Override
    public void run() {
    
    }
}
class MyThread2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Callable come in");
        TimeUnit.SECONDS.sleep(5);
        return 1024;
    }
}