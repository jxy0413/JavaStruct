package huisu;

import java.util.ArrayList;
import java.util.List;

/**
 * 已知所有数（无重复),求这组数的所有子集
 */
public class Qiuziji {
    public static void main(String[] args) {
        int a[] ={1,2,3};
        Qiuziji q = new Qiuziji();
        List<List<Integer>> subsets1 = q.subsets(a);
        System.out.println(subsets1);
    }
    public List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        dfs(nums,temp,0);
        res.add(new ArrayList<>());
        return res;
    }
    public List<List<Integer>> res=new ArrayList<>();
    public void dfs(int []nums,List<Integer> temp,int len){
        for(int i=len;i<nums.length;i++){
            temp.add(nums[i]);
            res.add(new ArrayList<>(temp));
            dfs(nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }

//    private static void generate(int i, int[] nums, List<Integer> item, List<List<Integer>> result) {
//        if(i>=nums.length){
//            return;
//        }
//        item.add(nums[i]); //进入当前的数字
//        result.add(item);
//        generate(i+1,nums,item,result);
//        //如果不存在 弹出来
//        item.remove(i-1);
//        generate(i+1,nums,item,result);
//    }
}
