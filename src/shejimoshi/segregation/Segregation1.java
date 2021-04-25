package shejimoshi.segregation;

/**
 * Created by jxy on 2021/4/20 0020 18:24
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}

class C{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
    public void depend5(Interface1 i){
        i.operation5();
    }
}

class A{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}

//接口
interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{

    @Override
    public void operation1() {
        System.out.println("B 实现了 opertion1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 opertion2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 opertion3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了 opertion4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了 opertion5");
    }
}

class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("D 实现了 opertion1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了 opertion2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了 opertion3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 opertion4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 opertion5");
    }
}