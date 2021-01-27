package changkao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class LRU {
    public int[] LRU(int[][] operators,int k){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        List<Integer> list = new ArrayList();
        for(int i=0;i<operators.length;i++){
            int opt = operators[i][0];
            int key = operators[i][1];
            if(opt==1){
                if(map.containsKey(key)){
                    //先移除
                    map.remove(key);
                }
                if(map.size()==k){
                    map.remove(map.keySet().toArray()[0]);
                }
                map.put(key,operators[i][2]);
            }else if(opt==2){
                if(map.containsKey(key)){
                    int num = map.remove(key);
                    list.add(num);
                    map.put(key,num);
                }else{
                    list.add(-1);
                }
            }
        }
        int arr[] = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
