package java8;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author jiaxiangyu
 * @date 2022/12/25 4:51 下午
 *
 * 方法引用：若Lambda 体内的内容已经实现了，我们可以使用"方法引用"
 * 主要有三种语法格式：
 *    对象::实例方法名
 *    类::静态方法名
 *    类::实例方法名
 *
 * 注意：Lambda体中的参数列表和返回值类型，要和函数借口中的抽象方法的函数列表和返回值类型保持一致。
 *
 *
 * 二 构造器引用：
 *    格式：
 *    ClassName::New
 */
public class TestMethodRef {
    @Test
    public void test4(){
        Supplier<Employee> sup = Employee::new;

        

    }


    @Test
    public void test1(){
        Consumer<String> con = System.out::println;
        con.accept("abc");

        Employee e = new Employee();

        Supplier<String> sup = e::getName;
        String s = sup.get();
        System.out.println(s);
    }

    @Test
    public void test2(){
        Comparator<Integer> com = Integer::compare;

        BiPredicate<String, String> bp = String::equals;
        boolean test = bp.test("jia", "jia");

        System.out.println(test);

    }




}
