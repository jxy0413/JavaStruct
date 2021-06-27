package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/6/27 6:05 下午
 */
public class jianzhi10 {
  public int rectCover(int target) {
      if(target <= 0){
         return 0;
      }
      if(target == 1 || target == 2){
        return target;
      }
      return rectCover(target - 1) + rectCover(target - 2);
  }
}
