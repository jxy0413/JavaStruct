package zuopackage2;
//求小和
public class Code02_getSum {
    public static int getSum(int arr[]){
        int sum = 0;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    sum+=arr[j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,2,5};
        System.out.println(getSum(arr));
    }
}
