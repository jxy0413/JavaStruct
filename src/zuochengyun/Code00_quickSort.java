package zuochengyun;

public class Code00_quickSort {
    public static void QuickSort(int arr[],int left,int right){
        if(left>right){
            return;
        }
        int base = arr[left];
        int i=left;
        int j=right;
        while(i<j){
            while(arr[j]>=base&&i<j){
                j--;
            }
            while(arr[i]<=base&&i<j){
                i++;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = base;
        QuickSort(arr,0,i-1);
        QuickSort(arr,i+1,right);
    }

    public static void main(String[] args) {
        int arr[] ={1,32,45,35,2};
        QuickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
