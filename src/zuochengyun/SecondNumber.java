package zuochengyun;

public class SecondNumber {
    public static void main(String[] args) {
        int arr[] = {4,23,5,13,52,1,4,6};
        int max = 0;
        int second = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second = max;
                max = arr[i];
            }
            if(arr[i]<max&&arr[i]>second){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
