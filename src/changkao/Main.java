package changkao;

import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/8/22 7:00 下午
 * 2
 * 3 10
 * 4 730
 *
 * 100 1460
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x;
    int num1 = 0;
    int num2 = 0;
    for(int i = 0; i < n; i++){
      int stap = 0;
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
      if(num1==num2){
        System.out.println(1);
        break;
      }

      

      }
    }
}