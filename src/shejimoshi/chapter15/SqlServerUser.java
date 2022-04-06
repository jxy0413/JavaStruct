package shejimoshi.chapter15;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 2:25 下午
 */
public class SqlServerUser implements User{
    @Override
    public void insert(User user) {
        System.out.println("在sql Server中添加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在sql Server根据Id查询一条记录");
        return null;
    }
}
