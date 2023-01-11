package java8.stream;

import java8.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jiaxiangyu
 * @date 2023/1/2 7:13 下午
 * 一、Stream的三个操作步骤
 * 1、创建Stream
 *
 * 2、中间操作
 *
 * 3、终端操作（中止操作）
 */
public class TestStream1 {
    @Test
    public void test1(){
        //1、可以通过Collection提供的
        List<String> list = new ArrayList();
        Stream<String> listStream = list.stream();

        //2、通过Arrays的静态方法stream的数组流
        Employee[] emps = new Employee[10];
        Stream<Employee> stream = Arrays.stream(emps);

        //3、通过Stream类中的of方法
        Stream<String> aa = Stream.of("aa", "b", "c");

        //4、创造无限流
//        Stream<Integer> iterate = Stream.iterate(0, t -> t + 1);
//        iterate.limit(10).forEach(System.out::println);

        //生成
        Stream<Double> generate = Stream.generate(() -> (Math.random()));
        generate.forEach(System.out::println);

    }
}
