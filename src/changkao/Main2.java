package changkao;

import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/9/3 6:06 下午
 */
public class Main2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    for(int i=0 ;i<T;i++){
      Integer L = scanner.nextInt();
      Integer D = scanner.nextInt();
      Integer S = scanner.nextInt();
      Integer C = scanner.nextInt();
      int k  = S;
      for(int j=0;j<D; j++){
         k = k * C + k;
      }
      if(D >= L){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
  }
}
