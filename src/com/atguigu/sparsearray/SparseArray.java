package com.atguigu.sparsearray;

/**
 * Created by Cookie on 2019/10/14.
 */
public class SparseArray {
    public static void main(String[] args) {
        //创建一个原始的二维数组 11 * 11
        //0 表示没有子 1表示黑子 2表示篮子
        int chessArr[][] = new int[11][11];
        chessArr[1][2]=1;
        chessArr[2][3]=2;
        chessArr[4][5]=2;
        //输出原始的二维数组
        System.out.println("原始的二维数组: ");
        for(int [] row:chessArr){
            for(int data:row){
                System.out.print(data+" ");
            }
            System.out.println();
        }
        //将二维数组转换成稀疏数组
        //1.先遍历数组 得到其非0的数
        int sum =0 ;
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessArr[i][j]!=0){
                    sum++;
                }
            }
        }
        //2.创建稀疏数组
        int sparseArray[][] = new int [sum+1][3];
        //给稀疏数组赋值
        sparseArray[0][0]=11;
        sparseArray[0][1]=11;
        sparseArray[0][2]=sum;

        //遍历二维数组 将非0的值存放到sparseArr
        int count = 0;//用来记录第几个非0的数据
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessArr[i][j]!=0){
                    count++;
                    sparseArray[count][0]=i;
                    sparseArray[count][1]=j;
                    sparseArray[count][2]=chessArr[i][j];
                }
            }
        }

        //输出稀疏数组的形式
        System.out.println();
        System.out.println("得到的稀疏数组为：");
        for(int [] row:sparseArray){
            for(int data:row){
                System.out.print(data+" ");
            }
            System.out.println();
        }

       //将稀疏数组还原成二维数组
        //1.读取第一行 创建原始的数组
        int chessArr2[][] = new int [sparseArray[0][0]][sparseArray[0][1]];
        //2.对数组2进行赋值
        for(int i=1;i<sparseArray.length;i++){
            chessArr2[sparseArray[i][0]][sparseArray[i][1]]=sparseArray[i][2];
        }

        //打印数组
        System.out.println("还原后的二维数组: ");
        for(int [] row:chessArr2){
            for(int data:row){
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }
}
