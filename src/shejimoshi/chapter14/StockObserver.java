package shejimoshi.chapter14;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 9:36 下午
 */
public class StockObserver extends Observer{
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println("关闭股票行情，继续工作");
    }
}
