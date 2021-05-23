package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/5/19 9:57 下午
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * [
 *   [1,2,8,9],
 *   [2,4,9,12],
 *   [4,7,10,13],
 *   [6,8,11,15]
 * ]
 * 给定 target = 7，返回 true。
 *
 * 给定 target = 3，返回 false
 */
public class jianzhi1 {
    public static boolean Find(int target, int [][] array){
         int len = array.length -1;
         int i = 0;
         while ((len >= 0) && (i < array[0].length)){
           if(array[len][i] > target){
             len--;
           }else if(array[len][i] < target){
             i++;
           }else{
             return true;
           }
         }
         return false;
    }
}
