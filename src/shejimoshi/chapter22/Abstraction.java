package shejimoshi.chapter22;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 9:29 下午
 */
public class Abstraction {
    private Implementor implementor;

    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    public void operation(){
        implementor.Operation();
    }
}
