package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/6/27 6:11 下午
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 */
public class jianzhi11 {
  public static int NumberOf1(int n) {
      int num = 0;
      while (n != 0){
        n = n & (n - 1);
        num ++;
      }
      return num;
  }

  public static void main(String[] args) {
    System.out.println(NumberOf1(10));
  }
}
