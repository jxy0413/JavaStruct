package tanxin;

import java.util.ArrayList;
import java.util.List;

public class Yaobaizichuan {
    public static void main(String[] args) {
        int arr [] = {1,2};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(31);
        list.add(33);
        list.add(333);
        list.add(11);
        list.add(33);
        list.add(33);
        list.add(3);
        int i = wiggleMaxLength(list);
        System.out.println(i);
    }
    public static int wiggleMaxLength(List<Integer> nums){
        if(nums.size()<2){
            return nums.size();
        }
        final  int BEGIN = 0;
        final  int UP = 1;
        final  int DOWN = 2;
        int STATE = BEGIN;
        int maxLength = 1;  //摇摆长度最少为1

        for(int i=1;i<nums.size();i++){
            switch (STATE){
                case BEGIN:
                    if(nums.get(i-1)<nums.get(i)){
                        STATE = UP;
                        maxLength++;
                    }else if(nums.get(i-1)>nums.get(i)){
                        STATE =DOWN;
                        maxLength++;
                    }
                    break;
                case UP:
                    if(nums.get(i-1)>nums.get(i)){
                        STATE = DOWN;
                        maxLength++;
                    }
                    break;
                case DOWN:
                    if(nums.get(i-1)<nums.get(i)){
                        STATE = UP;
                        maxLength++;
                }
                    break;
            }
        }
        return maxLength;
    }
}
