/**
 * @(#)ThreadPool.java, 2021-03-18.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package godofbigdata;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ThreadPool
 *
 * @author jiaxiangyu
 * @since 2021/03/18
 */
public class ThreadPool {
    public static int POOL_NUM = 10;
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(
                5,5,1L, TimeUnit.SECONDS,new LinkedBlockingDeque<>(100),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
        );
        for(int i=0;i<POOL_NUM;i++){
            RunnableThread thread = new RunnableThread();
            executorService.execute(thread);
        }
    }
}
class RunnableThread implements Runnable{
    private int THREAD_NUM = 10;
    
    @Override
    public void run() {
        for(int i=0;i<THREAD_NUM;i++){
            System.out.println("线程"+Thread.currentThread()+" "+i);
        }
    }
}