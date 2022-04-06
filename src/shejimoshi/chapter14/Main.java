package shejimoshi.chapter14;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 9:37 下午
 */
public class Main {
    public static void main(String[] args) {
        Boss huhansan = new Boss();

        StockObserver tongshi1 = new StockObserver("围观吃", huhansan);

        StockObserver tongshi2 = new StockObserver("看NBA", huhansan);

        huhansan.attach(tongshi1);
        huhansan.attach(tongshi2);

        huhansan.detach(tongshi1);

        huhansan.notity();
    }
}
