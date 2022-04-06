package shejimoshi.chapter24;

/**
 * @author jiaxiangyu
 * @date 2022/4/6 11:31 上午
 */
public class GeneralManager extends Manager{
    protected GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.getRequestType() == "请假"){
            System.out.println(name + " : " + request.getRequestContent() + " 数量 " + request.getNumber() + " 被批准" );
        }else if(request.getRequestType() == "加薪" && request.getNumber() <= 500){
            System.out.println(name + " : " + request.getRequestContent() + " 数量 " + request.getNumber() + " 被批准" );
        }else {
            System.out.println(name + " : " + request.getRequestContent() + " 数量 " + request.getNumber() + " 再说吧" );
        }
    }
}
