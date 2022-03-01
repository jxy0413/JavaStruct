package shuzu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiaxiangyu
 * @date 2022/2/14 10:48 上午
 */
public class TwoSum {
    public static int[] twoSum (int[] numbers, int target) {
        // write code here
        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i<numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                return new int[]{map.get(target-numbers[i])+1, i+1};
            }else{
                map.put(numbers[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 3, 4}, 6);
        for(int i: ints){
            System.out.println(i);
        }
    }
}
