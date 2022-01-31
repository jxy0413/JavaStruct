package com.atguigu.sparsearray;

import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/9/8 7:29 下午
 * 给定两个字符串str1和str2，输出两个字符串的最长公共子序列的长度。如果最长公共子序列为空，则返回"0"。目前给出的数据，仅仅会存在一个最长的公共子序列
 */
public class Main {

  public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    String next = s.next();
    String next1 = s.next();
    System.out.println(maxSubStr(next, next1));
  }


  public static Integer maxSubStr(String str1,String str2){
    if(str1==null || str2 == null){
      return 0;
    }
    String max = "";
    String min = "";
    if(str1.length() < str2.length()){
      max = str2;
      min = str1;
    }else{
      min = str2;
      max = str1;
    }
    String cu = "";
    for(int i=0;i<min.length();i++){
      for(int begin = 0,end=min.length()-i;end<=min.length();begin++,end++){
        cu = min.substring(begin,end);
        if(max.contains(cu)){
          return cu.length();
        }
      }
    }
    return 0;
  }

}
