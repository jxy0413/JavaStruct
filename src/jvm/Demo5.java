package jvm;

/**
 * @author jiaxiangyu
 * @date 2022/2/5 2:29 下午
 */
public class Demo5 {
    volatile static boolean run = true;

    public static void main(String[] args) throws Exception{
        Thread t = new Thread(()->{
           while (run){
               System.out.println("1");
           }
        });
        t.start();

        Thread.sleep(1000);
        run = false;
    }
}
