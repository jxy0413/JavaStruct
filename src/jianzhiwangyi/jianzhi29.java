/**
 * @(#)jianzhi29.java, 2021-03-30.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * jianzhi29
 *
 * @author jiaxiangyu
 * @since 2021/03/30
 * 给定一个数组，找出其中最小的K个数。
 * 例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。如果K>数组的长度，那么返回一个空的数组
 * 示例1
 */
public class jianzhi29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
           ArrayList<Integer> ret = new ArrayList<>();
           int length = input.length;
           if(k>length || k<=0 ){
               return ret;
           }
           PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {
               @Override
               public int compare(Integer o1, Integer o2) {
                   return o2.compareTo(o1);
               }
           });
           
           for(int i=0;i<input.length;i++){
               if(queue.size()<k){
                   queue.add(input[i]);
               }else{
                   if(queue.peek()>input[i]){
                       queue.poll();
                       queue.add(input[i]);
                   }
               }
           }
           
           for(int num:queue){
               ret.add(num);
           }
           return ret;
    }
    
    public static void main(String[] args) {
        int arr [] = {4,5,1,6,2,7,3,8};
        jianzhi29 jianzhi29 = new jianzhi29();
        ArrayList<Integer> integers = jianzhi29.GetLeastNumbers_Solution(arr, 4);
        System.out.println(integers.toString());
    }
}