package shejimoshi.chapter24;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 10:40 下午
 */
public class ConcreteHandler3 extends Handler{

    @Override
    public void HandleRequest(int request) {
        if(request >= 20 && request < 30){
            System.out.println(" 请求参数 " + ConcreteHandler3.class + "\t" + request);
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
