package shejimoshi.chapter02;

/**
 * @author jiaxiangyu
 * @date 2022/4/1 10:24 下午
 */
public class CashFactory {

    public static CashSuper createCashAccpet(String type){
        CashSuper cs = null;
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300减100":
                cs = new CashReturn("300", "100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
            default:
                cs = null;
                break;
        }
        return cs;
    }

}
