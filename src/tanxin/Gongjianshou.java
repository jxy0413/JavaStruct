package tanxin;

import java.util.Arrays;

public class Gongjianshou {
    public static void main(String[] args) {
        int [] [] points ={{1,2},{2,3},{3,5},{4,5},{7,8}};
        System.out.println(findMinarrowShots(points));
    }
    public static int findMinarrowShots(int[][]points){
        if(points.length==0){
            return 0;
        }
        //对气球按照左端点从小到大排序
        Arrays.sort(points, (a, b) -> (a[1] - b[1]));

        int shoot_num = 1;

        int shoot_end = points[0][1]; //右端点

        for(int i=1;i<points.length;i++){
            //
            if(points[i][0]>shoot_end){
                 shoot_num++;
                 shoot_end = points[i][1];
            }
        }
        return shoot_num;
    }
}
