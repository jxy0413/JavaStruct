/**
 * @(#)jianzhi40.java, 2021-04-06.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.ArrayList;
import java.util.List;

/**
 * jianzhi40
 *
 * @author jiaxiangyu
 * @since 2021/04/06
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的
 *
 * [1,2,4,7,11,15],15
 *
 * [4,11]
 */
public class jianzhi40 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
         ArrayList<Integer> list = new ArrayList<>();
         if(array==null || array.length<2){
             return list;
         }
         int i = 0;
         int j = array.length - 1;
         while (i<j){
             if(array[i]+array[j]==sum){
                 list.add(array[i]);
                 list.add(array[j]);
                 return list;
             }else if(array[j]+array[i]>sum){
                 j--;
             }else{
                 i++;
             }
         }
         return list;
    }
    
    public static void main(String[] args) {
        jianzhi40 jianzhi40 = new jianzhi40();
        int arr [] = {1,2,4,7,11,15};
        ArrayList<Integer> integers = jianzhi40.FindNumbersWithSum(arr, 15);
        for(int i:integers){
            System.out.println(i);
        }
    }
}