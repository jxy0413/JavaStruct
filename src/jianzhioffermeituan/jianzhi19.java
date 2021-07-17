package jianzhioffermeituan;

import java.util.ArrayList;

/**
 * @author jiaxiangyu
 * @date 2021/7/3 6:29 下午
 * [[1,2,3,4],
 * [5,6,7,8],
 * [9,10,11,12],
 * [13,14,15,16]]
 *
 * [1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10]
 */
public class jianzhi19 {
  public ArrayList<Integer> printMatrix(int [][] matrix) {
    ArrayList<Integer> list = new ArrayList<>();
    if(matrix==null || matrix[0].length == 0 || matrix[0].length == 0){
      return list;
    }
    int up = 0;
    int down = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;
    while (true){
      //上
      for(int col = left; col <= right; col++){
        list.add(matrix[up][col]);
      }
      up++;
      if(up>down){
        break;
      }
      //右
      for(int col = up; col<= down;col++){
        list.add(matrix[col][right]);
      }
      right--;
      if(right<left){
        break;
      }
      //左
      for(int col = right; col>=left;col--){
        list.add(matrix[down][col]);
      }
      down++;
      if(down > up){
        break;
      }
      //下
      for(int col = down; col<=up; col++){
        list.add(matrix[col][left]);
      }
      left++;
      if(left > right){
        break;
      }
    }
    return list;
  }
}
