package shejimoshi.chapter16bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 9:21 下午
 */
public class AfternoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if(w.getHour() < 17){
            System.out.println("当前时间 " + w.getHour() +  " 继续努力");
        }else{
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
