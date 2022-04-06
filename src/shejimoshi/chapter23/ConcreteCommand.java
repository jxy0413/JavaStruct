package shejimoshi.chapter23;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 9:49 下午
 */
public class ConcreteCommand extends Command{
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
