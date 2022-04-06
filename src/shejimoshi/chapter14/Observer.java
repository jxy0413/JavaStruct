package shejimoshi.chapter14;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 9:27 下午
 */
public abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub){
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
