package java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author jiaxiangyu
 * @date 2022/12/24 3:18 下午
 *
 * Java8 : 内置的四大核心函数式接口
 * Consumer<T> : 消费型接口
 *       void accept(T t );
 * Supplier<T> : 共给型接口
 *       T get();
 * Function<T, R> 函数型接口
 *       R apply(T t);
 * Predicate<T> : 断言型接口
 *       Boolean test(T t)
 */
public class TestLambda3 {
    //Consumer<T> 消费型接口
    @Test
    public void test1(){
        happy(100, t -> System.out.println("消费型 " + t + "元"));
    }

    public void happy(double money, Consumer<Double> con){
        con.accept(money);
    }

    //Supplier<T> 共给型接口
    @Test
    public void test2(){
        List<Integer> numList = getNumList(10, () -> (int) (Math.random() * 100));
        numList.forEach(t -> System.out.println(t));
    }

    //需求，产生指定个数整数，放入集合中
    public List<Integer> getNumList(int num, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < num; i++){
            list.add(sup.get());
        }

        return list;
    }

    //函数型接口：
    @Test
    public void test3(){
        System.out.println(strHandler(" jia ", t -> t.trim()));
    }

    public String strHandler(String str, Function<String, String> fun){
       return fun.apply(str);
    }

    //断言形接口:
    @Test
    public void test4(){
       List<String> list = Arrays.asList("jia", "shi");
       filterStr(list,  t -> t.length() > 3);
    }

    //将满足条件的字符串，放入集合中
    public List<String> filterStr(List<String> list, Predicate<String> pre) {
        List<String> strlist = new ArrayList<>();
        for(String str  : strlist){
            if(pre.test(str)){
                strlist.add(str);
            }
        }
        return strlist;
    }

}
