package zifuchuan;

import java.util.Arrays;

/**
 * Created by jxy on 2019/10/30.
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class OnlyOne {
    public static void main(String[] args) {
         int [] num ={4,5,4};
         int res = singleNumber2(num);
         System.out.println(res);
    }

    public static int singleNumber(int []nums){
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res ^= nums[i];
        }
        return res;
    }

    public static int singleNumber2(int []nums){
        if(nums.length<2){
            return nums[0];
        }
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i+=2){
            if(i==nums.length-1||nums[i]!=nums[i+1]){
                res=nums[i];
                break;
            }
        }
        return res;
    }

}
