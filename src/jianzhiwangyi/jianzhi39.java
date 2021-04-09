/**
 * @(#)jianzhi39.java, 2021-04-06.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * jianzhi39
 *
 * @author jiaxiangyu
 * @since 2021/04/06
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * [1,4,1,6]
 * [4,6]
 */
public class jianzhi39 {
    public int[] FindNumsAppearOnce (int[] array) {
         Map<Integer,Integer> map = new HashMap();
         for(int i=0;i<array.length;i++){
             if(!map.containsKey(array[i])){
                 map.put(array[i],1);
             }else{
                 map.put(array[i],map.get(array[i])+1);
             }
         }
        Set<Integer> integers = map.keySet();
         int arr [] = new int[2];
         int k = 0;
         for(Integer i:integers){
             if(map.get(i)==1){
                 arr[k] = i;
                 k++;
             }
         }
        return arr;
    }
    
    public static void main(String[] args) {
        jianzhi39 jianzhi39 = new jianzhi39();
        int arr [] = {1,4,1,6};
        int[] ints = jianzhi39.FindNumsAppearOnce(arr);
        for(int i:ints){
            System.out.println(i);
        }
    }
}