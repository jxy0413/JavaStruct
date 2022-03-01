package jvm;

/**
 * @author jiaxiangyu
 * @date 2022/2/1 9:22 下午
 * StringTable['a','b''ab'] hashTable 不能扩容
 */
public class Demo1_22 {
    /**
     * 常量池的信息，都会加载到运行时常量池中 这时 a b ab 都是常量池中的符号 哈没有变成java对象
     * @param args
     */
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;

        String s5 = "a" + "b"; //javac 在编译期间的优化，结果已经在编译期间确定为ab
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
    }
}
