package nio;

import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/9/11 2:34 下午
 */
public class Main1 {
   public static void QuickSort(int [] num,int left ,int right){
     if(left>=right){
       return;
     }
     int key = num[left];
     int i = left;
     int j = right;
     while (i<j){
       while (num[j]>=key && i<j){
         j--;
       }
       while (num[i]<=key && i<j){
         i++;
       }
       if(i<j){
         int temp = num[i];
         num[i] = num[j];
         num[j] = temp;
       }
       num[left] = num[i];
       num[i] = key;
       QuickSort(num,left,i-1);
       QuickSort(num,i+1, right);
     }
   }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int arr [] = new int [num];
    for(int i=0;i<num;i++){
      int i1 = s.nextInt();
      arr[i] = i1;
    }
    QuickSort(arr,0, arr.length-1);
    for(int i : arr){
      System.out.print(i + " ");
    }
  }
}
