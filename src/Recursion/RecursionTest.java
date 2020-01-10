package Recursion;

/**
 * Created by Cookie on 2019/10/19.
 */
public class RecursionTest {
    public static void main(String[] args) {
       // test(4);
        System.out.println(factorial(5));
    }


    public static void test(int n){
        if(n>2){
            test(n-1);
        }
        System.out.println("n= "+n);
    }

    //阶乘
    public static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }

}
