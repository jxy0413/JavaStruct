package dui;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindNumber {
    //找第n个最大数
    public static int findKthLargest(List<Integer> list, int k){
        //建立最小堆
        PriorityQueue<Integer>minQueue = new PriorityQueue();
        for(int i=0;i<list.size();i++){
            if(i<k){
                minQueue.add(list.get(i));
            }else if(minQueue.peek()<list.get(i)){
                minQueue.remove();
                minQueue.add(list.get(i));
            }
        }
        return minQueue.peek();
    }

    //寻找中位数 用堆
    static PriorityQueue<Integer>minQueue1 = new PriorityQueue();
    static PriorityQueue<Integer>maxQueue1 = new PriorityQueue();
    public static void addNum(int num){
        if(maxQueue1.isEmpty()){
            maxQueue1.add(num);
            return;
        }
        //相等的时候最简单 直接插入
        if(minQueue1.size()==maxQueue1.size()){
            if(num<maxQueue1.peek()){
                maxQueue1.add(num);
            }else{
                minQueue1.add(num);
            }
        }else if(minQueue1.size()>maxQueue1.size()){  //最小堆多一个
            if(num<maxQueue1.peek()){
                //直接插入到最大堆
                maxQueue1.add(num);
            }else{
                maxQueue1.add(minQueue1.remove());
                minQueue1.add(num);
            }
        }else{
            if(num<maxQueue1.peek()){
                //直接插入到最小堆
                minQueue1.add(maxQueue1.remove());
                maxQueue1.add(num);
            }else{
                minQueue1.add(num);
            }
        }
    }


    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(2);
        int kthLargest = findKthLargest(list, 4);
        System.out.println(kthLargest);
    }
}
