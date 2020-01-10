package Recursion;

/**
 * Created by Cookie on 2019/10/19.
 */
public class MiGong {
    public static void main(String[] args) {
        //先创建一个二维迷宫
        int [][] map =new int[8][7];
        //设置墙
        //上下左右都设置为1
        for(int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }

        for(int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
        }

        //设置挡板 1表示
        map[3][1]=1;
        map[3][2]=1;

        //遍历一下数组
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }

        //使用递归回溯法给小球找路
        setWay(map,1,1);
        System.out.println("小球走过,并标识过的地图的情况。。");
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     *
     * @param map  从哪个地图
     * @param i    从哪个位置开始找
     * @param j
     * @return  如果找到通路 就返回true 否则返回false
     */
    public static boolean setWay(int [][] map,int i,int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {  //如果当前的这个点还没有走过 就按照下 右 上 左 走
                map[i][j] = 2; //假设该点可以走通
                if (setWay(map, i + 1, j)) {  //向下走
                    return true;
                } else if (setWay(map, i, j + 1)) {  //向右走
                    return true;
                } else if (setWay(map, i - 1, j)) {
                    return true; //向上走
                } else if (setWay(map, i, j - 1)) {
                    return true;
                } else {
                    //说明该点是走不通的 是死路
                    map[i][j] = 3;
                    return false;
                }
            }else{
                return false;
            }
        }

    }

}
