package juc;

public class SingletonDemoBak {
    private volatile static SingletonDemoBak singletonDemoBak=null;

    private SingletonDemoBak(){}

    public SingletonDemoBak getSingletonDemoBak(){
        if(singletonDemoBak==null){
            synchronized (SingletonDemoBak.class){
                if(singletonDemoBak==null){
                    singletonDemoBak = new SingletonDemoBak();
                }
            }
        }
        return singletonDemoBak;
    }
}
