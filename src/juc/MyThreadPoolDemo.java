package juc;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/9 10:08
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(3,5,1L, TimeUnit.SECONDS,
        new LinkedBlockingDeque<>(3), Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());
        
        try {
            for(int i=1;i<=10;i++){
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"\t办理业务");
                });
            }
        }finally {
            threadPool.shutdown();
        }
    }
}
