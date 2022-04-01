package mainshi;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author jiaxiangyu
 * @date 2022/3/3 9:41 上午
 */
public class ThreeSum {
    /**
     * 三数之和
     * @param nums
     * @return
     */
    public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
       int len = nums.length;
       if(len < 3){
           return res;
       }

       //对其排序
       Arrays.sort(nums);

       for(int i=0; i<len; i++){
           if(nums[i] > 0){
               return res;
           }
           //注意边界i>0 主要是排除重复值
           if(i > 0 && nums[i] == nums[i-1]){
               continue;
           }
           //声明指针
           int cur = nums[i];
           int left = i + 1;
           int rihgt = len - 1;
           while (left < rihgt){
               int resNum = cur + nums[left] + nums[rihgt];
               if(resNum == 0){
                   ArrayList<Integer> list = new ArrayList<>();
                   list.add(cur);
                   list.add(nums[left]);
                   list.add(nums[rihgt]);
                   res.add(list);
                   //判断指针是否重复
                   while (left < rihgt && nums[left] == nums[left+1]){
                       left++;
                   }
                   while (left < rihgt && nums[rihgt] == nums[rihgt-1]){
                       rihgt--;
                   }
                   //移动指针
                   left++;
                   rihgt--;
               }else if(resNum < 0){
                   left++;
               }else{
                   rihgt--;
               }
           }
       }
       return res;
    }

    public static void main(String[] args) {
        int arr[] =  {-2,0,1,1,2};
        ArrayList<ArrayList<Integer>> arrayLists = threeSum(arr);
        System.out.println(arrayLists.toString());
    }
}
