package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-27
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 * 传统的解题思路
 */
public class test11 {
      public  static double Power(double base,int exponent){
         double res =1;
         for(int i=0;i<Math.abs(exponent);i++){
             res*=base;
         }
         if(exponent<0){
             res = 1/res;
         }
         return res;
      }

    public static void main(String[] args) {
        System.out.println( Power(-5,2));
    }

}
