package shejimoshi.chapter01;

/**
 * @author jiaxiangyu
 * @date 2022/4/1 9:15 下午
 */
public class OperationClient {
    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("+");
        operate.setNumberA(1);
        operate.setNumberB(2);
        System.out.println(operate.getResult());
    }
}
