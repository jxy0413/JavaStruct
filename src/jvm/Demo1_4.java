package jvm;

/**
 * @author jiaxiangyu
 * @date 2022/2/1 5:20 下午
 * 查看对象个数 堆存储 dump
 */
public class Demo1_4 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("1...");
        Thread.sleep(30000);
        byte [] array = new byte[10 * 1024 * 1024];
        System.out.println("2....");
        Thread.sleep(30000);
        array = null;
        System.gc();
        System.out.println("3....");
        Thread.sleep(1000000l);
    }
}
