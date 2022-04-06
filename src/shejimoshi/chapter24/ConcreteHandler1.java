package shejimoshi.chapter24;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 10:34 下午
 */
public class ConcreteHandler1 extends Handler{
    @Override
    public void HandleRequest(int request) {
        if(request >= 0 && request < 10){
            System.out.println(" 请求参数 " + ConcreteHandler1.class + "\t" + request);
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
