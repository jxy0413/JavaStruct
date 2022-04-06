package shejimoshi.chapter16;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 3:17 下午
 */
public class Context {
    private State state;

    public Context(){
        this.state = new ConcreteStateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void request(){
        state.handle(this);
    }
}
