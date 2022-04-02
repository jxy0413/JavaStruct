package shejimoshi.chapter06;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 12:01 下午
 * 服饰类
 */
public class Finery extends Person{
    protected Person component;

    public void Decorator(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null){
            component.show();
        }
    }
}
