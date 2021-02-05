package zuochengyun;

import static zuochengyun.Code01_selectionSort.swap;

public class Code03_InsertSort {
    public static void insertSort(int arr[]){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                  swap(arr,j,j+1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,2,4,6,2};
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
