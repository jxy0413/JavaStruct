package shejimoshi.chapter16bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 9:19 下午
 */
public class NoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if(w.getHour() < 13){
            System.out.println("当前时间：" + w.getHour() + " 午休，犯困， 午休");
        }else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
