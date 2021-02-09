package zuochengyun;

public class Code07_yihuo {
    public static void main(String[] args) {
        int a = 6;
        int b  = 1000;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
