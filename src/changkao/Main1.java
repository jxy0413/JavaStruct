package changkao;

import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/8/22 7:37 下午
 */
public class Main1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x;
    int num1 = 0;
    int num2 = 0;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < 2; j++){
        x = sc.nextInt();
        if(j==0){
          //位数
          num1 = x;
        }else{
          //值
          num2 = x;
        }
      }
      int k1 = 1;
      int k2 = 10;
      if(num1<0 || num2 <0){
        System.out.println(-1);
        break;
      }
      for(int k = 1;k<num1;k++){
        k1 *= 10;
        k2 *= 10;
      }
      boolean flag = true;
      for(int m = k1;m<k2;m++){
        if(m % num2 ==0){
          System.out.println(m);
          flag = false;
          break;
        }
        System.out.println(m);
      }
      if(flag){
        System.out.println(-1);
      }
    }
  }
}
