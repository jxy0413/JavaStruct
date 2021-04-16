package gc;

/**
 * Created by jxy on 2021/4/10 0010 15:51
 */
public class GCRootDemo {
    private byte[] byteArray = new byte[100 * 1024 * 1024];

    public static void m1(){
        GCRootDemo t1 = new GCRootDemo();
        System.gc();
        System.out.println("第一次GC完成");
    }

    public static void main(String[] args) {
        m1();
    }
}
