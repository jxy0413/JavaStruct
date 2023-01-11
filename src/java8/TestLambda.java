package java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author jiaxiangyu
 * @date 2022/12/11 12:50 下午
 * Java8中新引入的一个新的操作符 ->
 * 将箭头操作符Lambda表达式拆分成两部分：
 * 左侧：Lambda 表达式中的参数列表
 * 右侧：Lambda 表达式所需执行的功能
 *
 * 语法格式一：无参数无返回值
 *    () -> System.out.println("hello Lambda!")
 *
 * 语法格式二：有一个参数 无返回值
 *
 * 语法格式三：如果只有一个参数，小括号可以不写
 *
 * 语法格式四：有两个以上参数，有多条语句 有返回值 {}
 *
 * 语法格式五：若Lambda体只有一条语句 {} return 都不用写
 *
 * 语法格式六：若Lambda体的参数类型可以省略不写，因为JVM编译器通过上下文可以推断出
 *
 * 左右遇一括号省
 * 左侧推断类型省
 *
 * 二、Lambda 表达式需要函数式接口的支持
 * 函数式接口只有一个抽象方法的接口，称为函数式借口
 */
public class TestLambda {
    List<Employee> list = Arrays.asList(
            new Employee("zhangsan", 18, 999.0),new Employee("lisi", 28, 999.0)
    );


    @Test
    public void test1(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        r.run();

        System.out.println("--------------");

        Runnable r1 = () -> System.out.println("Hello world");
        r1.run();
    }

    @Test
    public void test2(){
        Consumer<String> con = (t) -> System.out.println(t);
        con.accept("三块在线");
    }

    @Test
    public void test3(){
        Consumer<String> con = t -> System.out.println(t);
        con.accept("三块在线");
    }

    @Test
    public void test4(){
        Comparator<Integer> com = (x, y) -> {
            System.out.println("hello");
            return Integer.compare(x, y);
        };
    }

    @Test
    public void test5(){
        Comparator<Integer> com = Integer::compare;
    }

    @Test
    public void test6(){
        Integer operation = operation(100, (x) -> x * x);
        System.out.println(operation);
    }

    public Integer operation(Integer num, MyFun mf){
        return mf.getValue(num);
    }

    @Test
    public void test7(){
        Collections.sort(list, (e1, e2) -> {
            if(e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else{
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        list.forEach(System.out::println);
    }

    //需求：用于处理字符串的
    public String strHandler(String str, MyFunction myFunction){
        return myFunction.getValue(str);
    }

    public void op(Long l1, Long l2, MyFunction2<Long, Long> mf){
        System.out.println(mf.getValue(l1, l2));
    }

    @Test
    public void test9(){
        op(100l, 200l, (x, y) -> x + y);
    }

    @Test
    public void test8(){
        System.out.println(strHandler(" jia ", (t1) -> t1.trim()));
    }
}
