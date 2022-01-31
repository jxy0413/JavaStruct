package changkao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/10/13 7:50 下午
 */
public class Mian19 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String next = sc.next();
    StringBuilder sb = new StringBuilder();
    String[] split = next.split(":");
    String dui = "";
    Map<String,String> a = a(dui);
    for(String s: split){
      String s1 = a.get(s);
      sb.append(s1);
    }
    System.out.println(sb.toString());
  }

  public static Map<String,String> a(String a){
    String substring = a.substring(1, a.length()-1);
    String[] split = substring.split(",");
    Map<String,String> map = new HashMap<>();
    for(String str : split){
      String[] split1 = str.split(":");
      map.put(split[0],split1[1]);
    }
    return map;
  }
}
