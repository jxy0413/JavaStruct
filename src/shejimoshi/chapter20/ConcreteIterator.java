package shejimoshi.chapter20;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 3:32 下午
 */
public class ConcreteIterator extends Iterator{
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate){
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        Object res = null;
        current++;
        if(current < aggregate.Count()){
            res = aggregate.get(current);
        }
        return res;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.Count() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }
}
