package shejimoshi.chapter14bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 10:20 下午
 */
public class Main {
    public static void main(String[] args) {
        ConcreateSubject s = new ConcreateSubject();
        s.attach(new ConcreteObserver(s, "X"));
        s.attach(new ConcreteObserver(s, "Y"));
        s.attach(new ConcreteObserver(s, "Z"));

        String abc = s.sbujectState("ABC");
        System.out.println(abc);

        s.notity();
    }
}
