package sort;

/**
 * @author jiaxiangyu
 * @date 2021/8/23 7:44 下午
 */
public class MergeSort {
   public static void mergeSort(int [] a, int low ,int high){
     int mid = low + (high - low)/2;
     if(low < high){
       //左面
       mergeSort(a, low, mid);
       mergeSort(a, mid + 1, high);
       merge(a, low, mid, high);
     }
   }

   public static void merge(int [] arr, int low, int mid, int high){
     int [] temp = new int[high - low +1];
     int i = low; //座指针
     int j = mid+1; //右指针
     int k = 0;
     while (i<= mid && j<= high){
       if(arr[i] < arr[j]){
         temp[k++] = arr[i++];
       }else{
         temp[k++] = arr[j++];
       }
     }
     //左面
     while (i<=mid){
       temp[k++] = arr[i++];
     }
     //右面
     while (j<=high){
       temp[k++] = arr[j++];
     }
     //把新数组中的数覆盖nums数组
     for(int k2 = 0; k2<temp.length;k2++){
         arr[k2+low] = temp[k2];
     }
   }

  public static void main(String[] args) {
    int arr[] = {1,5,3,5,12,6};
    mergeSort(arr, 0, arr.length-1);
    for(int i : arr){
      System.out.println(i);
    }
  }
}
