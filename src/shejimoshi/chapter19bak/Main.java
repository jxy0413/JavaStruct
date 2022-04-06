package shejimoshi.chapter19bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 2:41 下午
 */
public class Main {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司人力财务部"));
        root.add(comp);

        System.out.println("结构图");
        root.display(1);

        System.out.println("指责图");
        root.lineofDuty();
    }
}
