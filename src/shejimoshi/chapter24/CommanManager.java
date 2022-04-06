package shejimoshi.chapter24;

/**
 * @author jiaxiangyu
 * @date 2022/4/6 11:17 上午
 */
public class CommanManager extends Manager{
    protected CommanManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.getRequestType() == "请假" && request.getNumber() <= 2){
            System.out.println(name + " : " + request.getRequestContent() + " 数量 " + request.getNumber() + " 被批准" );
        }else{
            if(superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
