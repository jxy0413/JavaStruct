package sort;

/**
 * @author jiaxiangyu
 * @date 2021/8/18 8:18 下午
 */
public class InsertSortBak {

  public static void main(String[] args) {
     int arr [] = {1,4,13,5,3};
     insertSort(arr);
     for(int i : arr){
       System.out.println(i);
     }
  }

  public static void insertSort(int arr[]){
    int insertVal = -100000;
    int insertIndex = 0;
    for(int i=1; i<arr.length;i++){
      insertIndex = i - 1;
      insertVal = arr[i];
      while (insertIndex >= 0 && insertVal < arr[insertIndex]){
        arr[insertIndex+1] = arr[insertIndex];
        insertIndex--;
      }
      arr[insertIndex+1] = insertVal;
    }
  }

}
