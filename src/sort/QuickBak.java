package sort;

/**
 * @author jiaxiangyu
 * @date 2021/8/18 8:39 下午
 */
public class QuickBak {
  public static void quickSort(int [] arr, int low, int high){
    if(low > high){
      return;
    }
    int i = low;
    int j = high;
    int temp = arr[low];
    while (i<j){
          while (temp <= arr[j] && i<j){
            j--;
          }
          while (temp >= arr[j] && i<j){
            i++;
          }
          if(i < j){
             int tmp = arr[i];
             arr[i] = arr[j];
             arr[j] = tmp;
          }
          arr[low] = arr[i];
          arr[i] = temp;
          quickSort(arr, low,j-1);
          quickSort(arr, j+1, high);
    }
  }

  public static void main(String[] args) {
    int arr[] = {2,4,1,8,9};
    quickSort(arr, 0 ,arr.length-1);
    for(int i : arr){
      System.out.println(i);
    }
  }

}
