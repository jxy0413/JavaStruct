package jianzhiwangyi;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/16 16:53
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 7,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
 */
public class jianzhi1 {
    
    public static void main(String[] args) {
        int target = 7;
       
    }
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            int low = 0;
            int high = array[i].length-1;
            while (low<=high){
                int mid = (high+low)/2;
                if(target==array[i][mid]){
                    return true;
                }else if(target>array[i][mid]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
