package shejimoshi.chapter16bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 9:22 下午
 */
public class EveningState extends State{
    @Override
    public void writeProgram(Work w) {
         if(w.isFinish()){
             w.setState(new RestState());
             w.writeProgram();
         }else{
             if(w.getHour() < 21){
                 System.out.println("当前时间：" + w.getHour() + " 加班哦，疲惫至极");
             }else{
                 w.setState(new SleepingState());
                 w.writeProgram();
             }
         }
    }
}
