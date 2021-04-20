package shejimoshi.principle;

/**
 * Created by jxy on 2021/4/20 0020 18:04
 */
public class SinlgeResponsibility3 {
    public static void main(String[] args) {
        Veriche2 veriche2 = new Veriche2();
        veriche2.run("汽车");
        veriche2.runAir("飞机");
        veriche2.runWater("游艇");
    }
}
//修改方法。
//1、没有对原来的类做大的修改
//2、这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责。
class Veriche2{
    //1.在方式1的run方法中，违反了单一职责原则
    //2.解决方法非常的简单，根据交通工具运行的方法不同，分成不同的类即可
    public void run(String vehicle){
        System.out.println(vehicle + " 在公路运行......");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + " 在空中运行......");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle + " 在水中运行......");
    }
}
