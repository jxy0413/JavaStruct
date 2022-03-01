package shuzu;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiaxiangyu
 * @date 2022/2/10 10:52 上午
 */
public class LRUTest {
    /**
     *输入：
     * [[1,1,1],[1,2,2],[2,1],[1,3,3],[2,2],[1,4,4],[2,1],[2,3],[2,4]],2
     * 复制
     * 返回值：
     * [1,-1,-1,3,4]
     * @param operators
     * @param k
     * @return
     */
    public static int[] LRU (int[][] operators, int k) {
        Map<Integer, Integer> map = new LinkedHashMap();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<operators.length; i++){
            int opt = operators[i][0];
            int key = operators[i][1];
            int val = operators[i][2];
            if(opt == 1){
                //先看是否有
                if(map.containsKey(key)){
                    map.remove(key);
                    map.put(key, val);
                }else{
                    //先判断是否满
                    if(k==map.size()){
                        map.remove(map.keySet().toArray()[0]);
                    }
                    map.put(key, val);
                }
            }else if(opt == 2){
                if(map.containsKey(key)){
                    list.add(key);
                    map.remove(key);
                    map.put(key, val);
                }else{
                    list.add(-1);
                }
            }
        }
        int [] arr = new int[list.size()];
        for(int i=0; i< list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
