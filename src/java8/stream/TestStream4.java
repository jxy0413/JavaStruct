package java8.stream;

import java8.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2023/1/2 10:21 下午
 */
public class TestStream4 {
    List<Employee> employees = Arrays.asList(
            new Employee("zhangsan", 18, 999.0),new Employee("lisi", 28, 999.0)
    );

    @Test
    public void test1(){
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream().map(t -> t * t).forEach(System.out::println);
    }

    @Test
    public void test2(){
        System.out.println(employees.stream().count());
        System.out.println(employees.stream().map((t) -> 1).reduce(Integer::sum).get());
    }

    List<Tranaction> tranactions = null;

    @Before
    public void before(){
        Trader trader = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");

        tranactions = Arrays.asList(
               new Tranaction(trader, 2011, 300.0),
                new Tranaction(mario, 2019, 400.0)
        );
    }


}
