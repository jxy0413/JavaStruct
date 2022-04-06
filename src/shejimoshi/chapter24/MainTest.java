package shejimoshi.chapter24;

/**
 * @author jiaxiangyu
 * @date 2022/4/6 11:33 上午
 */
public class MainTest {
    public static void main(String[] args) {
        CommanManager jinli = new CommanManager("金利");
        MajorDemo zongjian = new MajorDemo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");

        jinli.SetSuperior(zongjian);
        zongjian.SetSuperior(generalManager);

        Request request = new Request();
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        request.setRequestType("请假");

        jinli.requestApplications(request);
    }
}
