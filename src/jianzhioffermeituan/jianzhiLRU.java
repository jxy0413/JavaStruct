package jianzhioffermeituan;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 设计LRU缓存结构，该结构在构造时确定大小，假设大小为K，并有如下两个功能
 * set(key, value)：将记录(key, value)插入该结构
 * get(key)：返回key对应的value值
 * [要求]
 * set和get方法的时间复杂度为O(1)
 * 某个key的set或get操作一旦发生，认为这个key的记录成了最常使用的。
 * 当缓存的大小超过K时，移除最不经常使用的记录，即set或get最久远的。
 * 若opt=1，接下来两个整数x, y，表示set(x, y)
 * 若opt=2，接下来一个整数x，表示get(x)，若x未出现过或已被移除，则返回-1
 * 对于每个操作2，输出一个答案
 * [[1,1,1],[1,2,2],[1,3,2],[2,1],[1,4,4],[2,2]],3
 * @author jiaxiangyu
 * @date 2021/7/6 8:01 下午
 */
public class jianzhiLRU {

  /**
   *
   * @param operators
   * @param k
   * @return
   */
    public int[] LRU (int [][] operators, int k){
      LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
      List<Integer> list = new ArrayList<Integer>();

      for(int i=0; i< operators.length;i++){
         Integer opt = operators[i][0];
         Integer key = operators[i][1];
         //添加
         if(opt==1){
             if(map.containsKey(key)){
               map.remove(key);
             }else{
               if(map.size() == k){
                 map.remove(map.keySet().toArray()[0]);
               }
             }
             map.put(key, operators[i][1]);
         }else if(opt==2){
           if(map.containsKey(key)){
                Integer val = map.remove(key);
                map.put(key,val);
                list.add(val);
           }else{
             list.add(-1);
           }
         }
      }
      int[] arr = new int[list.size()];

      for(int i = 0 ; i < arr.length ; i++){
        arr[i] = list.get(i);
      }
      return arr;
    }
}
