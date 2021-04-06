/**
 * @(#)jianzhi32.java, 2021-03-30.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi32
 *
 * @author jiaxiangyu
 * @since 2021/03/30
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */
public class jianzhi32 {
    public String PrintMinNumber(int [] numbers) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int a = Integer.valueOf(numbers[i]+""+numbers[j]);
                int b = Integer.valueOf(numbers[j]+""+numbers[i]);
                if(a>b){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int i=0;i<numbers.length;i++){
            str.append(String.valueOf(numbers[i]));
        }
        return str.toString();
    }
    
    public static void main(String[] args) {
        jianzhi32 jianzhi32 = new jianzhi32();
        int arr[] = {3,32,321};
        System.out.println(jianzhi32.PrintMinNumber(arr));
    }
}