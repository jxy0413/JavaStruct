package shejimoshi.chapter19bak;

import changkao.A;
import shejimoshi.chapter19.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 2:27 下午
 * 具体公司类
 */
public class ConcreteCompany extends Company{
    private List<Company> children = new ArrayList();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
         children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(Utils.stringLine(depth) + name);
         for(Company company : children){
             company.display(depth + 2);
         }
    }

    @Override
    public void lineofDuty() {
         for(Company company : children){
             company.lineofDuty();
         }
    }
}
