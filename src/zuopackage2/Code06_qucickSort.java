package zuopackage2;

public class Code06_qucickSort {
    public static void sort(int arr[],int left,int right){
        if(left>right){
            return;
        }
        int i = left;
        int j = right;
        int base = arr[left];
        while (i<j){
            while (i<j&&arr[j]>=base){
                j--;
            }
            while (i<j&&arr[i]<=base){
                i++;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j]=temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = base;
        sort(arr,0,i-1);
        sort(arr,i+1,right);
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5};
        sort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
