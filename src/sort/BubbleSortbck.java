package sort;

/**
 * @author jiaxiangyu
 * @date 2021/8/18 8:15 下午
 */
public class BubbleSortbck {
   public static void sort(int arr[]){
     for(int i=0; i<arr.length-1;i++){
       for(int j=0; j<arr.length-i-1; j++){
           if(arr[j] > arr[j+1]){
             int temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
           }
       }
     }
   }

  public static void main(String[] args) {
    int arr [] = {1,3,4,2,5};
    sort(arr);
    for(int a : arr){
      System.out.println(a);
    }
  }
}
