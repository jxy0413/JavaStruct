package jvm;

/**
 * @author jiaxiangyu
 * @date 2022/2/5 3:08 下午
 */
public class Demo6 {
    private static volatile Demo6 instance = null;

    private Demo6(){}

    public static Demo6 getInstance(){
        if(instance == null){
            synchronized (Demo6.class){
                if(instance == null){
                    instance = new Demo6();
                }
            }
        }
        return instance;
    }
}
