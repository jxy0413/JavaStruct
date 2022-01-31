package changkao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * @author jiaxiangyu
 * @date 2021/9/6 3:37 下午
 */
public class Main5 {
   public static String[] scoresore(String [] names, String[] scores){
      Map<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
          return o2.compareTo(o1);
        }
      });

      for(int i=0;i<scores.length;i++){
        String name = names[i];
        String[] split = scores[i].split(",");
        int res = 0;
        for(String str : split){
           res += Integer.parseInt(str);
        }
        map.put(res, name);
      }

      String res [] = new String[names.length];
      int i =0;

      Iterator<Integer> iter = map.keySet().iterator();

      while (iter.hasNext()){
        res[i] = map.get(iter.next());
        i++;
      }

      return res;
   }

  public static void main(String[] args) {
    String scores[] = {"1,1,1","2,2,2","3,3,3"};
    String name[] = {"jia", "wei", "wang"};
    String[] scoresore = scoresore(name, scores);
    for(String str: scoresore){
      System.out.println(str);
    }
  }
}
