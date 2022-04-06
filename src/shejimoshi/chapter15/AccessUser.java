package shejimoshi.chapter15;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 2:29 下午
 */
public class AccessUser implements User{
    @Override
    public void insert(User user) {
        System.out.println("在Access中 添加 一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据Id 得到一条记录");
        return null;
    }
}
