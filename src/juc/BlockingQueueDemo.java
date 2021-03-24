package juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by jxy on 2021/3/24 0024 10:41
 * 1 队列
 *
 * 2 阻塞队列
 *   2.1 阻塞队列有没有好的一面
 *
 *   2.2 不得不阻塞，你如何管理
 *
 *
 */
public class BlockingQueueDemo {
    public static void main(String[] args)throws Exception {
//        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(3);
//        System.out.println(blockingQueue.add("a"));
//        System.out.println(blockingQueue.add("b"));
//        System.out.println(blockingQueue.add("c"));
//
//        System.out.println(blockingQueue.element());
//
//        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());
//        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(3);
//        System.out.println(blockingQueue.offer("a"));
//        System.out.println(blockingQueue.offer("b"));
//        System.out.println(blockingQueue.offer("c"));
//        System.out.println(blockingQueue.offer("d"));
//
//        System.out.println(blockingQueue.poll());
//        System.out.println(blockingQueue.poll());
//        System.out.println(blockingQueue.poll());
//        System.out.println(blockingQueue.poll());
          BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(3);
//          blockingQueue.put("a");
//          blockingQueue.put("a");
//          blockingQueue.put("a");
//          System.out.println("=================================");
//          //blockingQueue.put("x");
//          blockingQueue.take();
//          blockingQueue.take();
//          blockingQueue.take();
//          blockingQueue.take();
        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));
    }
}
