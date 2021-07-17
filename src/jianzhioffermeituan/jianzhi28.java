package jianzhioffermeituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author jiaxiangyu
 * @date 2021/7/13 10:22 下午
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组[1,2,3,2,2,2,5,4,2]。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。你可以假设数组是非空的，并且给定的数组总是存在多数元素。1<=数组长度<=50000
 */
public class jianzhi28 {
  public int MoreThanHalfNum_Solution(int [] array) {
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int i=0 ;i<array.length;i++){
        if(map.containsKey(array[i])){
             map.put(array[i],map.get(array[i]) + 1);
        }else{
             map.put(array[i],1);
        }
      }
      for(Entry<Integer,Integer> res:map.entrySet()){
        if(res.getValue()>array.length/2){
            return  res.getKey();
        }
      }
      return 0;
  }
}
