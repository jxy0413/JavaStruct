package haoweilai;

import java.util.HashMap;

public class liangshuzhihe {
    public static int[] twoSum(int[] numbers,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                return new int[]{map.get(target-numbers[i])+1,i+1};
            }else{
                map.put(numbers[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,23};
        int[] ints = twoSum(arr, 40);
        for(int i:ints){
            System.out.println(i);
        }
    }
}
