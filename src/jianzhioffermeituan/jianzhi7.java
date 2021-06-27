package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/6/27 5:42 下午
 */
public class jianzhi7 {
  public static int Fibonacci(int n) {
     if(n == 0){
        return 0;
     }
     if(n == 1){
       return 1;
     }
     return Fibonacci(n-1) + Fibonacci(n-2);
  }

  public static void main(String[] args) {
    System.out.println(Fibonacci(4));
  }
}
