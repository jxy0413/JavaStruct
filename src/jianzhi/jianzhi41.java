package jianzhi;

import java.util.ArrayList;

public class jianzhi41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
           //存放结果
           ArrayList<ArrayList<Integer>> result = new ArrayList<>();
           //两个起点，相当于动态窗口的两边，根据其窗口内的值的和来确定窗口的位置和大小
           int plow =1,phigh = 2;
           while (plow<phigh){
               int cur = (phigh+plow)*(phigh-plow+1)/2;
               //当等的话就加入结果集
               if(sum==cur){
                   ArrayList<Integer> list = new ArrayList<>();
                   for(int i=plow;i<phigh;i++){
                       list.add(i);
                   }
                   result.add(list);
                   plow++;
               }else if(cur<sum){
                   phigh++;
               }else{
                   plow++;
               }
           }
           return result;
    }

    public static void main(String[] args) {
        jianzhi41 jianzhi41 = new jianzhi41();
        System.out.println(jianzhi41.FindContinuousSequence(100));
    }
}
