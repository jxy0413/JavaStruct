package jianzhioffermeituan;

import zuopackage2.QuickSort;

/**
 * @author jiaxiangyu
 * @date 2021/7/26 8:26 下午
 */
public class jianzhiKuaipai {
    public static void quickSort(int [] num, int left, int right){
      if(left >= right){
        return;
      }
      int key = num[left];
      int i = left;
      int j = right;
      while (i<j){
        while (num[j] >= key && i< j){
          j--;
        }
        while (num[i] <= key && i<j){
          i++;
        }
        if(i < j){
          int temp = num[i];
          num[i] = num[j];
          num[j] = temp;
        }
      }
      num[left] = num[i];
      num[i] = key;
      //QuickSort(num, left, i-1);

    }
}
