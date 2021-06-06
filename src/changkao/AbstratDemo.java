package changkao;

import hashtab.HashTabDemo;
import java.util.HashMap;
import java.util.Hashtable;
import juc.VolatileDemo;

/**
 * @author jiaxiangyu
 * @date 2021/5/30 3:14 下午
 */
public abstract class AbstratDemo {

  public static void main(String[] args) {
    System.out.println("jia");
    HashMap<String,String> map = new HashMap<>();
    map.put(null, null);
    System.out.println(map.keySet());
    Hashtable table = new Hashtable();
    table.put(null,null);
    System.out.println(table.keySet());
  }
}
