package string;

/**
 * @author jiaxiangyu
 * @date 2022/12/3 5:11 下午
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(get());
        System.out.println(test());

    }

    public static int get(){
        int a = 1;
        try {
            return a + 1;
        }finally {
            a = 2;
        }
    }

    public static int test(){
        int a = 1;
        try {
            return a;
        }finally {
            a = 2;
            return a + 1;
        }
    }
}
