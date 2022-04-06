package shejimoshi.chapter15;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 2:39 下午
 */
public class AccessDepartment implements Department{
    @Override
    public void Insert(Department department) {
        System.out.println("在Access中 添加 一条记录");
    }

    @Override
    public Department getDepartmentById(int id) {
        System.out.println("在Access中根据Id 得到一条记录");
        return null;
    }
}
