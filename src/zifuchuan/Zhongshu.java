package zifuchuan;

import java.util.Arrays;

/**
 * Created by jxy on 2019/10/31.
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 你可以假设数组是非空的，并且给定的数组总是存在众数。
 */
public class Zhongshu {
    public static void main(String[] args) {
        int nums[]={3,2,4,3,5,1,3,4,4,2,3,1,3};
        int n = majoriryElement(nums);
    }

    public static int majoriryElement(int []nums){
            int L = nums.length;
            if(L==0) return -1;
            if(L==1) return nums[0];
             //开始计算
            Arrays.sort(nums);
            return nums[L/2];
    }


}
