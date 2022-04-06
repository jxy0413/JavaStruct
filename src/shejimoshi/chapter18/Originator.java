package shejimoshi.chapter18;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 12:05 下午
 * 发起人类
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMento(){
        return new Memento(state);
    }

    public void setMemonto(Memento memonto){
        state = memonto.getState();
    }

    public void show(){
        System.out.println("state = " + state);
    }
}
