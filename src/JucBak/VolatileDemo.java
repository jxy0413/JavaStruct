package JucBak;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/5 10:48
 */
public class VolatileDemo {
    public static void main(String[] args) {
        seeOkByVolatile();
    }
    public static void seeOkByVolatile(){
        MyData myData = new MyData();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t come in");
            try {
                Thread.sleep(3000);
                myData.addData();
                System.out.println(Thread.currentThread().getName()+"\t updated number value "+myData.num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AAA").start();
        //第二个线程就是我们的main线程
        while (myData.num==0){
            //main线程一直在
        }
        System.out.println(Thread.currentThread().getName()+"\t"+"miss is over");
    }
}
class MyData{
    volatile int num = 0;
    public void addData(){
        this.num = 60;
    }
}