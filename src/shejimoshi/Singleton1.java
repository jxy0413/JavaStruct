package shejimoshi;

public class Singleton1 {
    public static Singleton1 singleton;

    private Singleton1 (){}

    public static Singleton1 getInstance(){
        if(singleton==null){
            singleton = new Singleton1();
        }
        return singleton;
    }

}
