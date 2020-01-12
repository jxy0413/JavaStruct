package shuzu;

import java.util.Arrays;

/**
 * Created by jxy on 2020/1/12.
 */
public class shuzi {
    public static void main(String[] args) {
        int [] p = {1,3,2,1,1,3,4,1,1,1};
        shuzi s = new shuzi();
        int i = s.MoreThanHalfNum_Solution(p);
        System.out.println(i);
    }

    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int [] array){
        Arrays.sort(array);
        int count= 0;

        for(int i=0;i<array.length;i++){
            if(array[i]==array[array.length/2]){
                count++;
            }
        }

        if(count>array.length/2){
            return array[array.length/2];
        }else{
            return 0;
        }
    }
}
