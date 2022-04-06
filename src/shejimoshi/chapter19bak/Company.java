package shejimoshi.chapter19bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 2:25 下午
 */
public abstract class Company {
    protected String name;

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int depth);
    public abstract void lineofDuty();
}
