package shejimoshi.chapter20;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 3:51 下午
 */
public class Main {

    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.set("大鸟");
        a.set("小菜");
        a.set("老外");
        a.set("公交内部员工");

        ConcreteIterator i = new ConcreteIterator(a);

        while (!i.isDone()){
            System.out.println(i.currentItem() + " 请买车票");
            i.next();
        }
    }
}
