package shejimoshi.chapter24;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 10:37 下午
 */
public class ConcreteHandler2 extends Handler{
    @Override
    public void HandleRequest(int request) {
        if(request >= 10 && request < 20){
            System.out.println(" 请求参数 " + ConcreteHandler2.class + "\t" + request);
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
