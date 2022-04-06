package shejimoshi.chapter08;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 3:02 下午
 */
public class Main {
    public static void main(String[] args) {
        IFactory iFactory = new UndergraduteFactory();

        LeiFeng student = iFactory.createLeifeng();

        student.buyRice();
        student.sweep();
        student.wash();
    }
}
