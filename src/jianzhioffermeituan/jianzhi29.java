package jianzhioffermeituan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author jiaxiangyu
 * @date 2021/7/13 10:51 下午
 * 给定一个数组，找出其中最小的K个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * 0 <= k <= input.length <= 10000
 * 0 <= input[i] <= 10000
 */
public class jianzhi29 {
  public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list  = new ArrayList<>();
        int length = input.length;
        if(k > length || k<=0){
          return list;
        }
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(01);
      }
    });
    for(int i=0; i<input.length; i++){
      if(maxHeap.size() != k){
        maxHeap.offer(input[i]);
      }else{
        if(maxHeap.peek() > input[k]){
          maxHeap.poll();
          maxHeap.offer(input[k]);
        }
      }
    }
    for(Integer num : maxHeap){
      list.add(num);
    }
    return list;
  }
}
