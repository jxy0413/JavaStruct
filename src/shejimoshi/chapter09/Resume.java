package shejimoshi.chapter09;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 3:44 下午
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;

    private WorkExperience work = null;

    public Resume(String name) throws Exception{
        this.name = name;
        work = new WorkExperience();
    }

    public void setPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExpericen(String workDate, String company){
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void display(){
        System.out.println("年龄 姓名 性别\t" + name + "\t" + age + "\t" + sex);
        System.out.println("工作经历 " + work.getWorkDate() + " \t "+ work.getCompany());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Object) super.clone();
    }
}
