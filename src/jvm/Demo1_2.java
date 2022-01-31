package jvm;

/**
 * @author jiaxiangyu
 * @date 2022/1/31 6:28 下午
 * 通过 -Xss256k
 */
public class Demo1_2 {
    private static int count;

    public static void main(String[] args) {
        try {
            method1();
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(count);
        }
    }

    private static void method1(){
        count++;
        method1();
    }
}
