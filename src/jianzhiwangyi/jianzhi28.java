/**
 * @(#)jianzhi28.java, 2021-03-25.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.HashMap;
import java.util.Map;

/**
 * jianzhi28
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由
 * 于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author jiaxiangyu
 * @since 2021/03/25
 */
public class jianzhi28 {
    public int MoreThanHalfNum_Solution(int [] array) {
         if(array.length==0||array==null){
             return 0;
         }
         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
         for(int i=0;i<array.length;i++){
             if(map.containsKey(array[i])){
                 map.put(array[i],map.get(array[i])+1);
             }else{
                 map.put(array[i],1);
             }
         }
         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
             if(entry.getValue()>array.length/2){
                 return entry.getKey();
             }
         }
         return 0;
    }
}