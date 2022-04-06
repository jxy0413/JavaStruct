package shejimoshi.chapter15;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 2:31 下午
 */
public class SqlServerFactory implements Factory{
    @Override
    public User createUser() {
        return new SqlServerUser();
    }

    @Override
    public Department createDepartment() {
        return new SqlserverDepartment();
    }
}
