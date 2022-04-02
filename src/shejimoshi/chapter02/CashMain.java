package shejimoshi.chapter02;

/**
 * @author jiaxiangyu
 * @date 2022/4/1 10:28 下午
 */
public class CashMain {

    public static void main(String[] args) {
//        CashSuper cashSuper = CashFactory.createCashAccpet("满300减100");
//        System.out.println(cashSuper.acceptCash(800));

        CashContext cashSuper1 = new CashContext("满300减100");
        System.out.println(cashSuper1.getResult(800));

    }
}
