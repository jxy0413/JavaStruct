package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/6/26 5:52 下午
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 输入：
 * [3,4,5,1,2]
 * 复制
 * 返回值：
 * 1
 */
public class jianzhi6 {
  public static int minNumberInRotateArray(int [] array) {
      if(array.length ==0 ){
        return 0;
      }
      int left = 0;
      int right = array.length -1;
      int mid = -1;
      while (array[left] >= array[right]){
        if(right - left ==1){
            mid = right;
            break;
        }
        mid = left + (right-left)/2;
        if(array[mid] >= array[left]){
          left = mid;
        }
        if(array[mid] <= array[right]){
          right = mid;
        }
      }
      return array[mid];
  }

  public static void main(String[] args) {
    int arr[] = {3,4,5,1,2};
    System.out.println(minNumberInRotateArray(arr));
  }
}
