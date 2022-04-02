package shejimoshi.chapter06;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 12:12 下午
 */
public class Main {
    public static void main(String[] args) {
        Person sc = new Person("jia");
        System.out.println("第一种装扮");

        BigTrouser q = new BigTrouser();
        Thirts t = new Thirts();

        q.Decorator(sc);
        t.Decorator(q);

        t.show();

    }
}
