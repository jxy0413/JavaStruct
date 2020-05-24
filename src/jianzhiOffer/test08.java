package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-23
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * 解题思路
 * f(1) = 1
 * f(2) = 2
 * f(3) = 3
 * f(4) = 5
 * f(5) = 8
 *
 * 可以得出f(n) = f(n-1) + f(n-2)
 */
public class test08 {
    public static int JumpFloor(int target){
        if(target <= 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int first = 1;
        int second = 2;
        int third = 0;
        for(int i=3;i<=target;i++){
            third  = first +second;
            first = second;
            second = third;
        }
        return third;
    }

    public static void main(String[] args) {
        int i = JumpFloor(5);
        System.out.println(i);
    }
}
