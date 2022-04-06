package shejimoshi.chapter18;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 12:06 下午
 * 备忘录类
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
