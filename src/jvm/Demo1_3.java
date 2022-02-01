package jvm;

/**
 * @author jiaxiangyu
 * @date 2022/2/1 10:45 上午
 */
public class Demo1_3 {
    static A a = new A();
    static B b = new B();
    public static void main(String[] args) {
        new Thread(()->{
            synchronized (a){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b){
                    System.out.println("我获取了a和b");
                }
            }
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            synchronized (b){
                synchronized (a){
                    System.out.println("我获取了b和a");
                }
            }
        }).start();
    }
}
class A{}
class B{}
