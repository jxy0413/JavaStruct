package jvm;

public class JVMNote {
    //输入参数和输出参数
    public int add(int x,int y){
        int result = -1;
        result = x+y;
        return result;
    }
    public static void main(String[] args) {
         test2();
    }

    public static void test1(){
        System.out.println("test1");
    }

    public static void test2(){
        test1();
        System.out.println("test2");
    }
}
