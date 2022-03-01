package shuzu;

/**
 * @author jiaxiangyu
 * @date 2022/3/1 6:30 下午
 */
public class Main {
    public static void main(String[] args) {
        String str3 = "ab";
        //str 在堆里面
        String str = new String("a") + new String("b");
        String str2 = str.intern();

        System.out.println(str == str2);
        System.out.println(str == str3);

        System.out.println(str2 == str3);

    }
}
