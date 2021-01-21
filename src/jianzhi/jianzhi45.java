package jianzhi;

import java.util.Arrays;

public class jianzhi45 {
    public boolean isContinuous(int [] numbers) {
          int numOfZero = 0;
          int numOfInterval = 0;
          int length = numbers.length;
          if(length==0){
              return false;
          }
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++){
            //计算癞子数量
            if(numbers[i]==0){
                numOfZero++;
                continue;
            }
            if(numbers[i]==numbers[i+1]){
                return false;
            }
            numOfInterval+=numbers[i+1]-numbers[i]-1;
        }
        if(numOfZero>=numOfInterval){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        jianzhi45 jianzhi45 =new jianzhi45();
        int arr [] = {0,3,2,6,4};
        System.out.println(jianzhi45.isContinuous(arr));
    }
}
