package string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2022/12/4 2:37 下午
 */
public class ListDemo {
    public static void main(String[] args) {
      List<String> list = new ArrayList();
      list.add("a");
      list.add("b");
      list.add("c");
      list.forEach(System.out::println);
      list.stream().forEach(System.out::println);

      //subList
        System.out.println(list.subList(0, 1));
        ArrayList strings = (ArrayList) list.subList(0, 1);
        System.out.println(strings);
    }
}
