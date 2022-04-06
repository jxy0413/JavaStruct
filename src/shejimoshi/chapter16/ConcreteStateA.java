package shejimoshi.chapter16;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 3:32 下午
 */
public class ConcreteStateA extends State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
