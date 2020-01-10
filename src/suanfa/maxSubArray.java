package suanfa;

/**
 * Created by jxy on 2019/10/23.
 */
public class maxSubArray {
    public static void main(String[] args) {
        int arr [] = {8,1,-2,4,8,-4,7,-1,-2};
        int number = maxSubArrayMethodOne(arr);
        System.out.println(number);
    }

    public static int maxSubArrayMethodOne(int arr[]){
        int n = arr.length;
        int ThisSum=0,MaxSum=0,i,j,k;

        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                ThisSum=0;      //重新累加子数组
                for(k=i;k<j;k++){
                    ThisSum+=arr[k];
                }
                if(ThisSum>MaxSum){
                    MaxSum=ThisSum;
                }
            }
        }
        return MaxSum;
    }
}
