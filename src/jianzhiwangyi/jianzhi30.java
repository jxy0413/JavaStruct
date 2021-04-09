/**
 * @(#)jianzhi30.java, 2021-03-30.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi30
 *
 * @author jiaxiangyu
 * @since 2021/03/30
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为 O(n).
 * [1,-2,3,10,-4,7,2,-5]
 * 18
 */
public class jianzhi30 {
    public int FindGreatestSumOfSubArray(int[] array) {
         if(array.length==0){
             return 0;
         }
         int max = array[0];
         int sum = array[0];
         for(int i=0;i<array.length;i++){
             if(sum>0){
                 sum = array[i] + sum;
             }else{
                 sum = array[i];
             }
             if(sum>max){
                 max = sum;
             }
         }
         return max;
    }
    
    public static void main(String[] args) {
        jianzhi30 jianzhi30 = new jianzhi30();
        int arr [] = {1,-2,3,10,-4,7,2,-5};
        System.out.println(jianzhi30.FindGreatestSumOfSubArray(arr));
    }
}