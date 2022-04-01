package shejimoshi.chapter01;

/**
 * @author jiaxiangyu
 * @date 2022/4/1 9:12 下午
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case  "+" :
                operation = new OperationAdd();
                break;
            case  "-" :
                operation = new OperationSub();
                break;
            default:
                operation = null;
                break;
        }
        return operation;
    }
}
