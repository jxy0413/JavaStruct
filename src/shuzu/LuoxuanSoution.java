package shuzu;

import java.util.ArrayList;

/**
 * @author jiaxiangyu
 * @date 2022/3/1 9:13 上午
 */
public class LuoxuanSoution {
    /**
     *
     * @param matrix  [[1,2,3],[4,5,6],[7,8,9]]
     * @return [1,2,3,6,9,8,7,4,5]
     */
    public static ArrayList<Integer> spiralOrder(int [][] matrix){
           ArrayList<Integer> res = new ArrayList();
           if(matrix.length == 0){
               return res;
           }
           //定义四个指针
           int top = 0;
           int bottom = matrix.length - 1;
           int left = 0;
           int right = matrix[0].length - 1;

           //终止条件为一半
           while (top < (matrix.length + 1)/2 && left < (matrix[0].length + 1) / 2){
               //上面 从左到右
               for(int i=left; i<=right; i++){
                   res.add(matrix[top][i]);
               }
               //右面 从上到下
               for(int i=top+1; i<=bottom; i++){
                   res.add(matrix[i][right]);
               }
               //下面 从右到左
               for(int i=right-1; i>=left && top != bottom; i--){
                   res.add(matrix[bottom][i]);
               }
               //左面 从下到上
               for(int i=bottom -1; i >= top+1 && right != left; i--){
                   res.add(matrix[i][left]);
               }
               //遍历一圈后，所有都往里靠
               top++;
               right--;
               bottom--;
               left++;
           }
           return res;
    }

    public static void main(String[] args) {
        //int [] [] tmp = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        int [] [] tmp = new int[][]{{2,3}};
        ArrayList<Integer> integers = spiralOrder(tmp);
        for(Integer s : integers){
            System.out.print(s + "\t");
        }
    }
}
