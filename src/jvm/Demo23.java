package jvm;

/**
 * @author jiaxiangyu
 * @date 2022/2/1 11:07 下午
 */
public class Demo23 {
    public static void main(String[] args) {
        String s = new String("a") + new String("b");
        String s2 = s.intern();
        System.out.println(s2 == "ab");
    }
}
