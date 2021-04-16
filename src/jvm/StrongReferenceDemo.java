package jvm;

/**
 * Created by jxy on 2021/4/16 0016 16:23
 */
public class StrongReferenceDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = obj;
        obj = null;
        System.gc();
        System.out.println(obj2);
    }
}
