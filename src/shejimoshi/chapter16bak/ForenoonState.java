package shejimoshi.chapter16bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 9:14 下午
 */
public class ForenoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if(w.getHour() < 12){
            System.out.println("当前时间 ： " + w.getHour() + " 上午工作， 精神百倍");
        }else{
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
