package shejimoshi.chapter12;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 8:27 下午
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
    }

    public void methodA(){
        System.out.println("方法组A() --- ");
        one.methodOne();
        two.methodTwo();
    }

    public void methodB(){
        System.out.println("方法组B() --- ");
        two.methodTwo();;
        one.methodOne();
    }
}
