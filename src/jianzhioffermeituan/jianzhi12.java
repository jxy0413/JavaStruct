package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/6/27 6:43 下午
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0。不得使用库函数，同时不需要考虑大数问题，也不用考虑小数点后面0的位数。
 */
public class jianzhi12 {
   public static double Power(double base, int exponent){
     double result = 1.0;
     if(exponent == 0){
       return 1;
     }
     for(int i=0;i<Math.abs(exponent);i++){
         result *= base;
     }
     if(exponent < 0){
         result = 1 / result;
     }
     return result;
   }

  public static void main(String[] args) {
     System.out.println(Power(2, 3));
  }
}
