package dongtaiguihua;

/**
 * Created by jxy on 2019/12/12.
 * 求最大子数和
 */
public class maxSubArray {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(nums);
        System.out.println(i);
    }

    //求最大子数和
    public static int maxSubArray(int[] nums){
        int sum = 0;
        int ans=nums[0];
        for(int num:nums){
             //如果是有益 就添加
            if(sum>0){
                sum+=num;
            }else{
                sum=num;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
