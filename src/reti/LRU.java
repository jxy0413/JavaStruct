package reti;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class LRU {
    /**
     * 二维数组
     * @param operators
     * @param k
     * @return
     */
    public static int [] LRU (int [][] operators,int k){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<operators.length;i++){
            Integer opt = operators[i][0]; //操作
            Integer key = operators[i][1]; //key
            if(opt==1){
                 if(map.containsKey(key)){
                     map.remove(key);
                 }else{
                     if(map.size()==k){
                         //已经超出了限制要移除
                         map.remove(map.keySet().toArray()[0]);
                     }
                 }
                 //添加进来
                map.put(key,operators[i][2]);
            }else if(opt==2){
                if(map.containsKey(key)){ //不要忘记get后也是要把key设为最新
                      int value = map.remove(key);
                      map.put(key,value);
                      list.add(map.get(key));
                }else{
                    list.add(-1);
                }
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++) arr[i]=list.get(i);
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};
        int[] lru = LRU(arr, 3);
        for(int i : lru){
            System.out.println(i+" ");
        }
    }
}
