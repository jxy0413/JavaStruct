package shejimoshi.chapter19bak;

import shejimoshi.chapter19.Utils;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 2:33 下午
 */
public class HRDepartment extends Company{
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println(Utils.stringLine(depth) + name);
    }

    @Override
    public void lineofDuty() {
        System.out.println("员工招聘培训管理 " + name);
    }
}
