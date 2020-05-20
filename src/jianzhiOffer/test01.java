package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-18
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class test01 {
    public static void main(String[] args) {
        //测试
        int[][] arr = new int[2][2];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;
        boolean find = Find(3, arr);
        System.out.println(find);
    }

    /**
     * 解题思路 将二维数组变成每一行都有序递增的一维数组
     * @param target
     * @param array
     * @return
     */
    public static boolean Find(int target,int [][]array){
        for(int i=0;i<array.length;i++){
            int low = 0;
            int high = array[i].length-1;
            while (low<=high){
                int mid = (low+high)/2;
                if(target>array[i][mid]){
                    low  = mid+1;
                }else if(target<array[i][mid]){
                    high = mid-1;
                }else{
                    return true;
                }
            }
        }
        return  false;
    }

}
