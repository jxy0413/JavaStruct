package shejimoshi.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 9:31 下午
 */
public class Boss implements Subject{
    private List<Observer> observerList = new ArrayList();
    private String action;

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notity() {
        for(Observer o : observerList){
            o.update();
        }
    }

    @Override
    public String subjectState() {
        return action;
    }
}
