package java8;

/**
 * @author jiaxiangyu
 * @date 2022/12/11 3:20 下午
 */
@FunctionalInterface
public interface MyFunction2 <T, R>{
    public R getValue(T t, R r);
}
