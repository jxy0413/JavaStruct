package shejimoshi.chapter22;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 9:27 下午
 */
public class ConcreteImplementorA implements Implementor{
    @Override
    public void Operation() {
        System.out.println("具体实现A的方法执行");
    }
}
