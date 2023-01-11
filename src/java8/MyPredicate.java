package java8;

/**
 * @author jiaxiangyu
 * @date 2022/12/4 10:42 下午
 */
@FunctionalInterface
public interface MyPredicate<T> {
    public Boolean filter(T t);
}
