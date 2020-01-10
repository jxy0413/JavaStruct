package search;

/**
 * Created by jxy on 2019/10/25.
 * Fibonacci查找算法
 */
public class FibonacciSearch {
    public static int maxsize=20;
    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 89, 1000, 1234};
    }
        //因为后面我们mid=low+F(k-1)-1 需要先获取一个斐波那契数列
        //非递归方法得到一个斐波那契数列
        public static int[] fib(){
            int [] f =new int[maxsize];
            f[0] = 1;
            f[1] = 1;
            for(int i=2;i<maxsize;i++){
                f[i]=f[i-1]+f[i-2];
            }
            return f;
        }




}
