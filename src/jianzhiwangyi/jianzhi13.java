/**
 * @(#)jianzhi13.java, 2021-03-17.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi13
 *
 * @author jiaxiangyu
 * @since 2021/03/17
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 输入 [1,2,3,4]
 * 输出 [1,3,2,4]
 */
public class jianzhi13 {
    public int[] reOrderArray (int[] array) {
        int count = 0;
        int index = 0;
        while (index<array.length){
            if((array[index]&1)==1){
               if(count!=index){  //前面有偶数
                   int temp = array[index];
                   for(int i=index;i>count;i--){
                       array[i] = array[i-1];
                   }
                   array[count] = temp;
               }
               count++;
            }
            index++;
        }
        return array;
    }
    
    public static void main(String[] args) {
        jianzhi13 jianzhi13 = new jianzhi13();
        int arr[] = {1,2,3,4};
        int[] ints = jianzhi13.reOrderArray(arr);
        for(int i:ints){
            System.out.println(i);
        }
    }
}