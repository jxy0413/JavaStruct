package shejimoshi.chapter16bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 9:25 下午
 */
public class RestState extends State{
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + " 下班回家了");
    }
}
