package zuopackage2;

public class Code01_MergeSort {
    public static void main(String[] args) {
        int a [] = {1,4,12,3,5,3};
        process(a,0,a.length-1);
        for(int i:a){
            System.out.println(i);
        }
    }

    public static void process(int []arr,int left,int right){
        if(left==right){
            return;
        }
        int mid = left+(right-left>>1);
        process(arr,left,mid);
        process(arr,mid+1,right);
        mergeSort(arr,left,mid,right);
    }

    private static void mergeSort(int[] arr, int left, int mid, int right) {
        int temp [] = new int[right-left+1];
        int p1 = left;
        int p2 = mid+1;
        int index = 0;
        while(p1<=mid&&p2<=right){
            if(arr[p1]>arr[p2]){
                temp[index++] = arr[p2++];
            }else{
                temp[index++] = arr[p1++];
            }
        }
        while (p1<=mid){
            temp[index++] = arr[p1++];
        }
        while (p2<=right){
            temp[index++] = arr[p2++];
        }
        for(int i=0;i<temp.length;i++){
            arr[i+left] = temp[i];
        }
    }

}
