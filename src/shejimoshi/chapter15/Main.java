package shejimoshi.chapter15;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 2:33 下午
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new SqlServerFactory();
        User iu = factory.createUser();

        iu.insert(new SqlServerUser());
        iu.getUser(1);

        System.out.println("\n***********************\n");

        Department department = factory.createDepartment();
        department.Insert(new SqlserverDepartment());
        department.getDepartmentById(1);

    }
}
