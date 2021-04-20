package shejimoshi.principle;

/**
 * Created by jxy on 2021/4/20 0020 17:51
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Veriche veriche = new Veriche();
        veriche.run("摩托车");
        veriche.run("飞机");
    }
}
class Veriche{
    //1.在方式1的run方法中，违反了单一职责原则
    //2.解决方法非常的简单，根据交通工具运行的方法不同，分成不同的类即可
    public void run(String vehicle){
        System.out.println(vehicle + " 在公路上运行......");
    }
}
