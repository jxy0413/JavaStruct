package shejimoshi.chapter08;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 2:54 下午
 */
public class VolunteerFactory implements IFactory{

    @Override
    public LeiFeng createLeifeng() {
        return new Volunteer();
    }
}
