package zuopackage2;

public class Code01_MergeSort {
    public static void process(int arr[],int left,int right){
        if(left==right){
            return;
        }
        int mid = left+(right-left>>1);
        process(arr,left,mid);
        process(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public static void merge(int arr[],int left,int mid,int right){
        int temp [] = new int[right-left+1];
        int p1 = left;
        int p2 = mid+1;
        int index = 0;
        while (p1<=mid&&p2<=right){
            if(arr[p1]<arr[p2]){
                temp[index++] = arr[p1++];
            }else{
                temp[index++] = arr[p2++];
            }
        }
        while (p1<=mid){
            temp[index++] = arr[p1++];
        }
        while (p2<=right){
            temp[index++] = arr[p2++];
        }
        for(int i=0;i<arr.length;i++){
            arr[i+left] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,2,5,1,42,53};
        process(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
