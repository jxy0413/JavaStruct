package jianzhioffermeituan;

import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/8/4 9:03 上午
 */
public class jianzhi88 {

   public static void test(){
     boolean flag = false;
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int max = -1000000000;
     int min = -1000000000;
     int u = 0;
     for(int i=0;i<num;i++){
       Scanner sc1 = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       if(a>b){
           max =a;
           min =b;
       }else{
           min = a;
           max = b;
       }
       for(int j = 0;j<3;j++){
         int i1 = sc.nextInt();
         if(i1!=0){
           u++;
         }
         if(i1 == max && u<3){
           System.out.println("jia");
           flag = true;
         }
       }

       if(flag){
         System.out.println("Y");
       }else{
         System.out.println("N");
       }
     }
   }

  public static void main(String[] args) {
    test();
  }
}
