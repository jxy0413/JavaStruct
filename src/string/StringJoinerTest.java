package string;


import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author jiaxiangyu
 * @date 2022/11/27 2:06 下午
 */
public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("Hello");
        sj.add("holliscchuang");
        sj.add("java 干活");
        System.out.println(sj.toString());

        StringJoiner sj1 = new StringJoiner(":", "[", "]");
        sj1.add("Hollis").add("hollischuang").add("Java 干货");
        System.out.println(sj1.toString());

        List<String> list = Arrays.asList("Hello", "Java", "Spark");
        String collect = list.stream().collect(Collectors.joining(":"));
        System.out.println(collect);
    }
}
