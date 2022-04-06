package shejimoshi.chapter16bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 9:15 下午
 */
public class Work {
    private State current;

    public Work(){
        current = new ForenoonState();
    }

    private double hour;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    private boolean finish = false;

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setState(State s){
        current = s;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
