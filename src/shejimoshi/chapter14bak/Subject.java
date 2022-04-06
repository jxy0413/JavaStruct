package shejimoshi.chapter14bak;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 9:58 下午
 */
public class Subject {
     private List<Observer> observers = new ArrayList<>();

     public void attach(Observer observer){
         observers.add(observer);
     }

     public void detach(Observer observer){
         observers.remove(observer);
     }

     public void notity(){
         for(Observer o : observers){
             o.update();
         }
     }
}
