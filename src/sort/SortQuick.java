package sort;

/**
 * @author jiaxiangyu
 * @date 2021/8/23 7:58 下午
 */
public class SortQuick {
   public static void sortQuick(int arr[], int left, int right){
        if(left > right){
          return;
        }
        int i = left;
        int j = right;
        int base  = arr[i];
        while (i < j){
          while (arr[j] >= base && i<j){
            j--;
          }
          while (arr[i] <= base && i<j){
            i++;
          }
          if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
        arr[left] = arr[i];
        arr[i] = base;
        sortQuick(arr, left, j-1);
        sortQuick(arr, j+1, right);
     }

  public static void main(String[] args) {
    int arr [] = {2,4,1,8,9};
    sortQuick(arr, 0, arr.length-1);
    for(int i : arr){
      System.out.println(i);
    }
  }
}
