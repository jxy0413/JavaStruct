package juc;

import java.util.concurrent.*;

/**
 * Created by jxy on 2021/4/9 0009 17:51
 */
public class MyThreadDemo1 {
    public static void main(String[] args) {
        ExecutorService threadPool =
                new ThreadPoolExecutor(2,5,1L, TimeUnit.SECONDS,new LinkedBlockingDeque<>(3),
                        Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        try {
            for(int i=1;i<=9;i++){
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"\t办理业务");
                });
            }
        }finally {
            threadPool.shutdown();
        }
    }
}
