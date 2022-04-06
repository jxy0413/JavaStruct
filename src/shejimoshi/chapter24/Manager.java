package shejimoshi.chapter24;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 11:07 下午
 */
public abstract class Manager {
    protected String name;

    //管理者的上级
    protected Manager superior;

    protected Manager(String name){
        this.name = name;
    }

    public void SetSuperior(Manager superior){
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);
}
