package Recursion;

/**
 * Created by Cookie on 2019/10/21.
 */
public class QueueEigth {
    //定义一个Max表示共同个
    int max = 8;
    //定义数组array 保存皇后的位置的结果
    int [] array = new int[max];
    static int count =0;
    static int judgeCount=0;

    public static void main(String[] args) {
        QueueEigth queueEigth = new QueueEigth();
        queueEigth.check(0);
        System.out.println("一共的解法为: "+count);
        System.out.println("一共判断的冲突次数 "+judgeCount);
    }

    //编写一个方法 放置第n个皇后
    public void check(int n){
        if(n==max){
            print();
            return;
        }
        //依次放入皇后 判断他是否冲突
        for(int i=0;i<max;i++){
            //先把当前的皇后 放到第一列
            array[n]=i;
            if(judge(n)){  //不冲突的话
                check(n+1);
            }
        }
    }

    /**
     * 查看当前我们放置的第n个皇后 是否跟前面的皇后冲突
     * @param n
     * @return
     */
    public boolean judge(int n){
        judgeCount++;
        for(int i=0;i<n;i++){
            //同一列跟斜线都不行
            if(array[i]==array[n]||Math.abs(n-i)==Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }

    //写一个方法,可以将皇后摆放的位置输出
    public void print(){
         count++;
         for(int i=0;i<array.length;i++){
             System.out.print(array[i]+" ");
         }
        System.out.println();
    }
}
