package juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/5 11:30
 */
public class CASDemo1 {
    public static void main(String[] args) {
        checkCAS();
    }
    public static void checkCAS(){
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5,2021)+"\t current data is "+atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5,2020)+"\t current data is "+atomicInteger.get());
    }
}
