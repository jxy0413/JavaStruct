package shejimoshi.chapter19;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 1:00 下午
 */
public abstract class Component {
    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void reomove(Component c);
    public abstract void display(int depth);

}
