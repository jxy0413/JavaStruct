package shejimoshi.chapter19bak;

import shejimoshi.chapter19.Utils;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 2:37 下午
 */
public class FinanceDepartment extends Company{
    public FinanceDepartment(String name) {
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
        System.out.println("公司财务支出管理 "+name);
    }
}
