package shejimoshi.chapter19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 1:45 下午
 */
public class Composite extends Component{
    private List<Component> children = new ArrayList();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void reomove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(depth + "" + name);

        for(Component component : children){
            component.display(depth + 2);
        }
    }
}
