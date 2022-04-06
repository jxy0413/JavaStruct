package shejimoshi.chapter20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 3:36 下午
 */
public class ConcreteAggregate extends Aggregate{
    private List<Object> items = new ArrayList();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int Count(){
        return items.size();
    }

    public Object get(int index){
        return items.get(index);
    }

    public void set(String value){
        items.add(value);
    }
}
