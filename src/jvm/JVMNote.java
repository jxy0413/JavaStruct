package jvm;

public class JVMNote {
    //输入参数和输出参数
    public int add(int x,int y){
        int result = -1;
        result = x+y;
        return result;
    }
    //Exception in thread "main" java.lang.StackOverflowError
    public static void main(String[] args) {
         test1();
    }

    public static void test1(){
       test1();
    }

    public static void test2(){
        test1();
        System.out.println("test2");
    }
}
