package juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * CAS===> compareAndSet
 * 比较并交换
 */
public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        //main do thing.....
        atomicInteger.getAndIncrement();
        System.out.println(atomicInteger.compareAndSet(5, 2019)+"\t current data: "+atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(2019, 1024)+"\t current data: "+atomicInteger.get());
    }
}
