package haoweilai;

public class Instance {
    private static Instance instance;
    private Instance(){}

    public static synchronized  Instance getInstance(){
        if(instance==null){
            instance = new Instance();
        }
        return instance;
    }
}
