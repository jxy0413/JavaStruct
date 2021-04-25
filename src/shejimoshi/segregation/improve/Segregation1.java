package shejimoshi.segregation.improve;

/**
 * Created by jxy on 2021/4/20 0020 18:24
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());  //A类通过接口依赖
        a.depend2(new B());
        a.depend3(new B());
    }
}

class C{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface3 i){
        i.operation4();
    }
    public void depend5(Interface3 i){
        i.operation5();
    }
}

class A{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface2 i){
        i.operation2();
    }
    public void depend3(Interface2 i){
        i.operation3();
    }
}

//接口
interface Interface1{
    void operation1();
}
//接口
interface Interface2{
    void operation2();
    void operation3();
}

interface Interface3{
    void operation4();
    void operation5();
}
class B implements Interface1,Interface2 {

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
}

class D implements Interface1,Interface3 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 opertion1");
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