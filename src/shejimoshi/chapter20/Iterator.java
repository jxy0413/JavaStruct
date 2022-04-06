package shejimoshi.chapter20;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 3:30 下午
 */
public abstract class Iterator {
    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}
