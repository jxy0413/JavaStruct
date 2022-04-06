package shejimoshi.chapter08;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 2:37 下午
 */
public class UndergraduteFactory implements IFactory{
    @Override
    public LeiFeng createLeifeng() {
        return new Undergraduate();
    }
}
