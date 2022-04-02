package shejimoshi.chapter02;

/**
 * @author jiaxiangyu
 * @date 2022/4/1 10:14 下午
 */
public class CashReturn extends CashSuper{
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn){
        this.moneyCondition  = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money > moneyCondition){
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
