package shejimoshi.chapter16;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 3:40 下午
 */
public class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
