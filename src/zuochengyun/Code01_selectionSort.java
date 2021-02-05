package zuochengyun;

public class Code01_selectionSort {
    public static void selectSort(int arr[]){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<arr[minIndex]){
                     minIndex = j;
                 }
            }
            swap(arr,i,minIndex);
        }
    }
    public static void swap(int arr[],int i,int j){
         int temp = arr[i];
         arr[i] =arr[j];
         arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,2,4,6,2};
        selectSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
