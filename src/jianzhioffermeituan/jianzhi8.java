package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/6/27 5:55 下午
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class jianzhi8 {
  public int jumpFloor(int target) {
     if(target <= 0){
       return 0;
     }else if(target == 1){
       return 1;
     }else  if(target == 2){
       return 2;
     }else {
       return jumpFloor(target-1) + jumpFloor(target-2);
     }
  }
}
