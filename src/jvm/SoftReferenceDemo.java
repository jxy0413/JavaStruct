package jvm;

import java.lang.ref.SoftReference;

/**
 * Created by jxy on 2021/4/16 0016 16:32
 */
public class SoftReferenceDemo {
    public static void softRef_Memory_Enough(){
        Object o1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(softReference.get());
        o1 = null;
        System.gc();
        System.out.println(o1);
        System.out.println(softReference.get());
    }

    public static void softRef_Memory_EotEnough(){
        Object o1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(softReference.get());
        o1 = null;
//        System.gc();
        try{
            byte [] bytes = new byte[30 * 1024 * 1024];
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(o1);
            System.out.println(softReference.get());
        }
    }


    public static void main(String[] args) {
        softRef_Memory_EotEnough();
    }
}
