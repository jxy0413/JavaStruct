package huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuiBingpaixu {
    public static void main(String[] args) {
        int [] ins = {2,1,34,532,15,-1,432,-13};
        int[] sort = sort(ins);
        for(int i:sort){
            System.out.print(i+"  ");
        }
    }
     public static int[] sort(int [] ins){
         if(ins.length<=1){
             return ins;
         }
         int num = ins.length/2;
         int[] temp=Arrays.copyOfRange(ins, 0, num);
         int[] left = sort(Arrays.copyOfRange(ins, 0, num));
         int[] right = sort(Arrays.copyOfRange(ins, num, ins.length));

         return mergeTwoVec(left,right);
     }



     public static int[] mergeTwoVec(int [] left,int [] right){
         int l = 0;
         int r = 0;
         List<Integer> list = new ArrayList();
         while(l<left.length&&r<right.length){
             if(left[l]<right[r]){
                 list.add(left[l]);
                 l++;
             }else{
                 list.add(right[r]);
                 r++;
             }
         }
         if(l>=left.length){
             for(int i=r;i<right.length;i++){
                 list.add(right[i]);
             }
         }

         if(r>=right.length){
             for(int i=l;i<left.length;i++){
                 list.add(left[i]);
             }
         }
         int []result = new int[list.size()];
         for(int i=0;i<list.size();i++){
             result[i] = list.get(i);
         }
         return result;
     }
}
