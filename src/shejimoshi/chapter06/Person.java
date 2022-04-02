package shejimoshi.chapter06;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 11:59 上午
 */
public class Person {
    public Person(){}

    private String name;

    public Person(String name){
        this.name = name;
    }

    public  void show(){
        System.out.println("装扮的 " + name);
    };
}
