package zuochengyun;

public class Code02_BubbleSort {
    public static void bubbleSort(int []arr){
        if(arr==null||arr.length<2){
            return ;
        }
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int arr[] = {1,3,2,4,5,2,6,1};
//        bubbleSort(arr);
        int[] ints = gengerateRandomArray(1213, 1213);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static int[] gengerateRandomArray(int maxSize,int maxValue){
        int arr[] = new int[(int)((maxSize+1)*Math.random())];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)((maxValue+1)*Math.random())-(int)(maxValue*Math.random());
        }
        return arr;
    }

}
