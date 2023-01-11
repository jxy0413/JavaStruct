package java8;

/**
 * @author jiaxiangyu
 * @date 2022/12/4 10:44 下午
 */
public class FiilterMyPredicate implements MyPredicate<Employee>{
    @Override
    public Boolean filter(Employee employee) {
        return employee.getAge() > 10;
    }
}
