package shejimoshi.chapter14;


/**
 * @author jiaxiangyu
 * @date 2022/4/3 9:22 下午
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notity();

    String subjectState();
}
