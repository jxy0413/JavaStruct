package changkao;

/**
 * @author jiaxiangyu
 * @date 2021/8/22 5:16 下午
 * 请实现有重复数字的升序数组的二分查找
 * 给定一个 元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的第一个出现的target，如果目标值存在返回下标，否则返回 -1
 */
public class Test5 {
  public static int search (int[] nums, int target) {
    // write code here
    int index = -1;
    int low = 0,high = nums.length -1;
    while (low <= high){
      int mid = low + (high - low) / 2;
      if(nums[mid] == target){
        index = mid;
        high = mid-1;
      }else if(nums[mid] > target){
        high = mid -1;
      }else{
        low = mid + 1;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    int arr [] = {1,2,4,4,5};
    System.out.println(search(arr, 4));
  }
}
