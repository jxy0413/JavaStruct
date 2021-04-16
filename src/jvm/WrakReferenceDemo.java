package jvm;

import java.lang.ref.WeakReference;

/**
 * Created by jxy on 2021/4/16 0016 17:02
 */
public class WrakReferenceDemo {
    public static void main(String[] args) {
        Object o1 = new Object();
        WeakReference<Object> weakReference = new WeakReference(o1);
        System.out.println(o1);
        System.out.println(weakReference.get());

        o1 = null;
        System.gc();
        System.out.println("=======================");

        System.out.println(o1);
        System.out.println(weakReference.get());
    }
}
