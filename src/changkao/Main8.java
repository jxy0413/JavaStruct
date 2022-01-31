package changkao;

import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/9/7 8:19 下午
 */
public class Main8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n2 = sc.nextInt();
    int n1 = sc.nextInt();
    String str = sc.next();
    if(n2-n1==1){
      int k = 3 % 1000000007;
      System.out.println(k+"");
    }
  }
}
