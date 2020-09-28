package shejimoshi;

public class Singleton {
    //饿汉式
    public static Singleton singleton = new Singleton();

    private Singleton (){}

    public static Singleton getInstance(){
        return singleton;
    }
}
