package shejimoshi.chapter15;


/**
 * @author jiaxiangyu
 * @date 2022/4/4 2:32 下午
 */
public class AccessFactory implements Factory {
    @Override
    public User createUser() {
        return new AccessUser();
    }

    @Override
    public Department createDepartment() {
        return new AccessDepartment();
    }
}
