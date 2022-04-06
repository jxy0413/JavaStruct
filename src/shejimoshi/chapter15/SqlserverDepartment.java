package shejimoshi.chapter15;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 2:37 下午
 */
public class SqlserverDepartment implements Department{
    @Override
    public void Insert(Department department) {
        System.out.println("在SQL Server中给Department表增加一条记录");
    }

    @Override
    public Department getDepartmentById(int id) {
        System.out.println("在SQL Server中根据ID 得到Department表记录");
        return null;
    }
}
