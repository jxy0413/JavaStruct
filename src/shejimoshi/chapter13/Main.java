package shejimoshi.chapter13;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 8:58 下午
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreateBuilder1();
        Builder b2 = new ConcrateBuilder2();

        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
