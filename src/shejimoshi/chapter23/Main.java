package shejimoshi.chapter23;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 9:59 下午
 */
public class Main {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();

        i.setCommand(c);
        i.executeCommand();
    }
}
