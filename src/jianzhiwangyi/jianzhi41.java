/**
 * @(#)jianzhi41.java, 2021-04-09.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import com.sun.org.apache.regexp.internal.RE;

/**
 * jianzhi41
 *
 * @author jiaxiangyu
 * @since 2021/04/09
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 *
 * "abcXYZdef",3
 * "XYZdefabc"
 */
public class jianzhi41 {
    public String LeftRotateString(String str,int n) {
          if(str.length()<=0){
              return "";
          }
          String s1 = str.substring(0,n);
          String s2 = str.substring(n, str.length());
          return s2+s1;
    }
    
    public static void main(String[] args) {
        String str = "abcXYZdef";
        jianzhi41 jianzhi41 = new jianzhi41();
        System.out.println(jianzhi41.LeftRotateString(str, 3));
    }
}