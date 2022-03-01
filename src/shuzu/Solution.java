package shuzu;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author jiaxiangyu
 * @date 2022/2/23 11:21 上午
 */
public class Solution {
    public static int maxLength(int [] arr){
        if(arr.length < 2){
            return arr.length;
        }
        Map<Integer,Integer> windows = new HashMap<>();
        int res = 0;
        int left = -1;

        for(int right = 0; right < arr.length; right++){
            //遇到重复数字
            if(windows.containsKey(arr[right])){
                left =  Math.max(left, windows.get(arr[right]));
            }
            res = Math.max(res, right - left);
            windows.put(arr[right], right);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr [] = {2,4,2,6,9};
        maxLength(arr);

        Stack<Character> stack = new Stack();
    }
}
