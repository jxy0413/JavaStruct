package com.atguigu.sparsearray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/9/8 7:53 下午
 */
public class Main1 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Integer [] arr = new Integer[10];
    for(int i=0;i<10;i++){
      String next = s.next();
      Integer num = Integer.parseInt(next);
      arr[i] = num;
    }

    pra(arr);

    for(Integer i :arr){
      System.out.print(i+" ");
    }
  }
  public static void pra(Integer []a){
    int cu = 0;
    int begin = 0;
    int end = a.length-1;
    while (cu < end){
      if(a[cu]==1){
        swap(a,cu,begin);
        begin++;
        cu++;
      }else if (a[cu]==3){
        swap(a,cu,end);
        end--;
      }else{
        cu++;
      }
    }
  }
  public static void swap(Integer []a,int i,int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

}
