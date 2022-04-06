package shejimoshi.chapter22;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 9:31 下午
 */
public class MainClient {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
