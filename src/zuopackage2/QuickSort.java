package zuopackage2;

public class QuickSort {
    public static void quickSort(int arr[],int left,int right){
        if(left>right){
            return;
        }
        int base = arr[left];
        int i = left;
        int j = right;
        while (i<j){
            while (arr[j]>=base&&i<j){
                j--;
            }
            while (arr[i]<=base&&i<j){
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
        quickSort(arr,0,i-1);
        quickSort(arr,i+1,right);
    }

    public static void main(String[] args) {
        int arr[] ={2,4,1,4,56,7};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
