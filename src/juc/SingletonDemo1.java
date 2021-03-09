package juc;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/5 11:15
 */
public class SingletonDemo1 {
    public static volatile SingletonDemo1 singletonDemo1 = null;
    private SingletonDemo1(){
        System.out.println(Thread.currentThread().getName()+"我是构造方法");
    }

    //DCL (双端检测机制)
    public static SingletonDemo1 getSingletonDemo1(){
        if(singletonDemo1==null){
            synchronized (SingletonDemo1.class){
                if(singletonDemo1==null){
                    singletonDemo1 = new SingletonDemo1();
                }
            }
        }
        return singletonDemo1;
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo1.getSingletonDemo1()==SingletonDemo1.getSingletonDemo1());
        for(int i=1;i<100000;i++){
            new Thread(()->{
                SingletonDemo1.getSingletonDemo1();
            },Thread.currentThread().getName()+i).start();
        }
    }
}
