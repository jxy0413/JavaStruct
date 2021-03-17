/**
 * @(#)jianzhi11.java, 2021-03-17.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi11
 *
 * @author jiaxiangyu
 * @since 2021/03/17
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 * 输入10 输出2
 */
public class jianzhi11 {
    public int NumberOf1(int n) {
         int num = 0;
         while (n!=0){
             n = n & (n-1);
             num++;
         }
         return num;
    }
    
    public static void main(String[] args) {
        jianzhi11 jianzhi11 = new jianzhi11();
        System.out.println(jianzhi11.NumberOf1(10));
    }
}