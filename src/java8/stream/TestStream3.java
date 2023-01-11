package java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jiaxiangyu
 * @date 2023/1/2 8:30 下午
 */
public class TestStream3 {
    @Test
    public void test1(){
        Stream<Integer> iterate = Stream.iterate(0, t -> t + 1);
        System.out.println(iterate.max(Integer::compareTo).get());

        System.out.println("----------------------------------------");


    }

    @Test
    public void test2(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.stream().map(t -> t+1 ).collect(Collectors.toList()).forEach(System.out::println);


        Map<String, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(Objects::toString));
        System.out.println(collect);
    }
}
