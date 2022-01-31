package changkao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2021/8/22 4:15 下午
 * 设计LRU(最近最少使用)缓存结构，该结构在构造时确定大小，假设大小为K，并有如下两个功能
 * 1. set(key, value)：将记录(key, value)插入该结构
 * 2. get(key)：返回key对应的value值
 * [[1,1,1],[1,2,2],[2,1],[1,3,3],[2,2],[1,4,4],[2,1],[2,3],[2,4]],2
 */
public class Test2 {
    public static int[] LRU (int [][] operators, int k){
      LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
      List<Integer> list = new ArrayList();

      for(int i=0; i< operators.length;i++){
        int opt = operators[i][0];
        int key = operators[i][1];

        if(opt == 1){
          //先移除
          if(map.containsKey(key)){
            map.remove(key);
          }
          if(map.size()==k){
            map.remove(map.keySet().toArray()[0]);
          }
          map.put(key, operators[i][2]);
        }
        else if(opt == 2){
          if(map.containsKey(key)){
            Integer num = map.remove(key);
            list.add(num);
            map.put(key, num);
          }else{
            list.add(-1);
          }
        }
      }
      int arr [] = new int[list.size()];

      for(int i=0; i< list.size();i++){
         arr[i] = list.get(i);
      }
      return arr;
    }

  public static void main(String[] args) {
  }
}
