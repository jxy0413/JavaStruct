package jianzhi;

public class jianzhi30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0){
            return 0;
        }else{
            int sum = array[0];
            int max = array[0];
            for(int i=1;i<array.length;i++){
                if(sum<0){
                    sum = array[i];
                }else{
                    sum+=array[i];
                }
                if(max<sum){
                    max = sum;
                }
            }
            return max;
        }
    }
}
