package shejimoshi.chapter19;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 1:21 下午
 * 叶子结点
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("can not add a leaf");
    }

    @Override
    public void reomove(Component c) {
        System.out.println("can not remove a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println(new String(depth + "") + name);
    }
}
