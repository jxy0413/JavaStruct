package java8.stream;

import java8.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jiaxiangyu
 * @date 2023/1/2 7:46 下午
 */
public class TestStream2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("zhangsan", 18, 999.0),new Employee("lisi", 28, 999.0)
        );

        Stream<Employee> employeeStream = employees.stream().filter(t -> t.getAge() > 20);
        employeeStream.forEach(System.out::println);
    }

    /**
     * 映射
     */
    @Test
    public void test3(){
        List<String> list = Arrays.asList("aaa", "bbb");
        list.stream()
                .map((str) -> str.toUpperCase())
                .forEach(System.out::println);


        list.stream().flatMap(TestStream2::filterCharater).forEach(t -> System.out.println(t));
    }

    public static Stream<Character> filterCharater(String str){
        List<Character> list = new ArrayList<>();

        for(Character ch : str.toCharArray()){
            list.add(ch);
        }
        return list.stream();
    }

    /**
     * 排序
     */
    @Test
    public void test4(){
        List<String> list = Arrays.asList("aaa", "bbb");
        list.stream().sorted().forEach(System.out::println);

        list.stream().sorted(String::compareTo);

        System.out.println(list.stream().count());
    }


    @Test
    public void test5(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list.stream().reduce(0, (t1, t2) -> t1 + t2));
    }
}
