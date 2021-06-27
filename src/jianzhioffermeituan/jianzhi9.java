package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/6/27 5:58 下午
 */
public class jianzhi9 {
  public int jumpFloorII(int target) {
      if(target <= 0){
        return 0;
      }
      if(target == 1){
        return 1;
      }
      return jumpFloorII(target-1) * 2;
  }
}
