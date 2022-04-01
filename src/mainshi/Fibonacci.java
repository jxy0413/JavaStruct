package mainshi;

/**
 * @author jiaxiangyu
 * @date 2022/3/2 9:19 上午
 */
public class Fibonacci {
    /**
     * 根据斐波那契数列的定义可知，fib(1)=1,fib(2)=1,fib(3)=fib(3-1)+fib(3-2)=2,fib(4)=fib(4-1)+fib(4-2)=3，所以答案为3
     * @param n
     * @return
     */
    public static int Fiboncaci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return Fiboncaci(n-1) + Fiboncaci(n-2);
    }

    public static int FiboncaciDT(int n){
        int preNum = 1;
        int prepreNum = 0;
        int result = 0;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        for(int i = 2; i <= n; i++){
            result = preNum + prepreNum;
            prepreNum = preNum;
            preNum = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(FiboncaciDT(4));
    }
}
