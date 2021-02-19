package haoweilai;

import java.util.HashMap;

public class Test2 {
    public static int[] twoSum(int [] numbers,int target){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

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
        int arr[] = {20,70,110,150};
        int[] ints = twoSum(arr, 130);
        for(int i:ints){
            System.out.println(i);
        }
    }
}
