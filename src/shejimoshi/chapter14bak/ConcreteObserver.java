package shejimoshi.chapter14bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 10:08 下午
 */
public class ConcreteObserver extends Observer{
    private String name;
    private String observerState;
    private ConcreateSubject subject;

    public ConcreteObserver(ConcreateSubject subject, String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        observerState = subject.sbujectState(observerState);
        System.out.println("观察者 " + name + " 新状态 " + observerState);
    }

    public ConcreateSubject subject(ConcreateSubject value){
        subject = value;
        return subject;
    }

}
