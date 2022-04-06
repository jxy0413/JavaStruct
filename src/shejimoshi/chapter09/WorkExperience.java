package shejimoshi.chapter09;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 3:44 下午
 */
public class WorkExperience implements Cloneable{
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
