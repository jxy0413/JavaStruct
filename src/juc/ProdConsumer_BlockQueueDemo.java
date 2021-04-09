/**
 * @(#)ProdConsumer_BlockQueueDemo.java, 2021-03-27.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package juc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ProdConsumer_BlockQueueDemo
 *
 * @author jiaxiangyu
 * @since 2021/03/27
 *
 * volatile/CAS/atomicInteger/BlockQueue/线程交互/资源类
 */
class MyResource{
    private volatile boolean FLAG = true;//默认开启，进行生产+消费
    private AtomicInteger atomicInteger = new AtomicInteger();
    
    BlockingQueue<String> blockingQueue = null;
    
    public MyResource(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
        System.out.println(blockingQueue.getClass().getName());
    }
    
    public void myProd()throws Exception{
        String data = null;
        while (FLAG){
             data = atomicInteger.incrementAndGet()+"";
             blockingQueue.offer(data,2L, TimeUnit.SECONDS);
        }
    }
    
}
public class ProdConsumer_BlockQueueDemo {
    public static void main(String[] args) {
    
    }
}