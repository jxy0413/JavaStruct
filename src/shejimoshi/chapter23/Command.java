package shejimoshi.chapter23;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 9:48 下午
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void execute();
}
