package mainshi;

/**
 * @author jiaxiangyu
 * @date 2022/3/3 9:44 上午
 */
public class QuickSort {
    public static void quickSort(int [] arr, int low, int high){
        if(low > high){
            return;
        }

        int i = low;
        int j = high;
        int base = arr[low];

        while (i < j){
            while (base <= arr[j] && i < j){
                j--;
            }
            while (base >= arr[i] && i < j){
                i++;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[i];
        arr[i] = base;

        quickSort(arr, low , j-1);
        quickSort(arr, j+1, high);
    }

    public static void main(String[] args) {
        int arr [] = {1,5,23,6,2};
        quickSort(arr, 0, arr.length - 1);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
