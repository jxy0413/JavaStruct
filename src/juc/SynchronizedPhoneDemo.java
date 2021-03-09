package juc;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/9 10:40
 */
public class SynchronizedPhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(()->{
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"Thread 1").start();
        new Thread(()->{
                phone.sendSMS();
        },"Thread 2").start();
    }
}
class Phone{
    public synchronized void sendSMS(){
        System.out.println(Thread.currentThread().getName()+"\t----invoked sendSMS()");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendEmail();
    }
    
    public synchronized void sendEmail(){
        System.out.println(Thread.currentThread().getName()+"\t+++++invoked sendEmail()");
    }
}
