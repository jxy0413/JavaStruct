package shejimoshi.chapter17;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 10:38 下午
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Adaptee.Adapter();
        target.request();
    }
}
