package jianzhi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class jianzhi29 {
    public static void main(String[] args) {
        jianzhi29 jianzhi29 = new jianzhi29();
        int num[] ={4,5,1,6,2,7,3,8};
        System.out.println(jianzhi29.GetLeastNumbers_Solution(num, 4));
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
           ArrayList<Integer> result = new ArrayList();
           int length = input.length;
           if(k>length||k==0){
               return  result;
           }
           PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
               @Override
               public int compare(Integer o1, Integer o2) {
                   return o2.compareTo(o1);
               }
           });
           for(int i=0;i<input.length;i++){
               if(maxHeap.size()!=k){
                   maxHeap.offer(input[i]);
               }else{
                   if(maxHeap.peek()>input[i]){
                       maxHeap.poll();
                       maxHeap.offer(input[i]);
                   }
               }
           }
           for(Integer num:maxHeap){
               result.add(num);
           }
           return result;
    }
}
