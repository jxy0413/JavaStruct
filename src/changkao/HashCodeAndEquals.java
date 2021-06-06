package changkao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jiaxiangyu
 * @date 2021/5/30 3:21 下午
 */
public class HashCodeAndEquals {

  public static void main(String[] args) {
    Object obj = new Object();
    System.out.println(obj.hashCode());
    Set set = new HashSet<String>();
    List list = new ArrayList();

  }
}
