package shejimoshi.chapter02;

/**
 * @author jiaxiangyu
 * @date 2022/4/1 10:07 下午
 * 打折收费子类
 */
public class CashRebate extends CashSuper{
    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
