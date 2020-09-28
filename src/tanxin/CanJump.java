package tanxin;

import java.util.ArrayList;
import java.util.List;

public class CanJump {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(2);
        System.out.println(canJump(list));

        int arr [] = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(List<Integer> nums){
        List<Integer> index = new ArrayList();
        for(int i=0;i<nums.size();i++){
              index.add(i+nums.get(i));
        }
        int jump = 0;
        int max_index =index.get(0);
        while (jump<index.size()&&jump<=max_index){
            if(max_index<index.get(jump)){
                max_index = index.get(jump); //更新操作
            }
            jump++;
        }
        if(jump==index.size()){
            return true;
        }
        return  false;
    }

    public static boolean canJump(int[] nums) {
        List<Integer> index = new ArrayList();
        for(int i=0;i<nums.length;i++){
            index.add(nums[i]+i);
        }
        System.out.println(index.toString());
        int jump = 0;
        int max = index.get(0);
        while(jump<max&&jump<=index.size()){
            if(max<index.get(jump)){
                max = index.get(jump);
            }
            jump++;
        }
        if(jump==index.size()){
            return true;
        }
        return false;
    }
}
