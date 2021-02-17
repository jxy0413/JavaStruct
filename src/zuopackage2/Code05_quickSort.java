package zuopackage2;

public class Code05_quickSort {
    public static void quickSort(int arr[],int left,int right){
        if(left>right){
            return;
        }
        int base = arr[left];
        int i = left;
        int j = right;
        while (i<j){
            while (i<j&&arr[j]>=base){
                j--;
            }
            while (i<j&&arr[i]<=base){
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
        int arr [] ={3,12,4,12,4,6};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }

}
