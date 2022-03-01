package jvm;

/**
 * @author jiaxiangyu
 * @date 2022/2/5 11:12 上午
 */
public class Demo4_1 {

    static int j = 0;
    static Object obj = new Object();

    public static void main(String[] args) throws Exception{

        long start = System.currentTimeMillis();

        Thread t1 = new Thread(()->{
            synchronized (obj) {
                for (int i = 0; i < 50000000; i++) {
                    j++;
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (obj) {
                for (int i = 0; i < 50000000; i++) {
                    j--;
                }
            }
        });

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        long end = System.currentTimeMillis();
        System.out.println("执行结束 " + j);
        System.out.println("花费时间 " + (end-start) + " 毫秒");
    }
}
