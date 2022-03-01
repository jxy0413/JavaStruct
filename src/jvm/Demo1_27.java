package jvm;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author jiaxiangyu
 * @date 2022/2/3 11:05 上午
 */
public class Demo1_27 {
    static int _1GB = 1024 * 1024 * 1024;

    public static void main(String[] args) throws Exception{
        Unsafe unsafe = getUnsafe();

        //分配内存
        long base = unsafe.allocateMemory(_1GB);
        unsafe.setMemory(base, _1GB, (byte) 0);
        System.in.read();

        //释放内存
        unsafe.freeMemory(base);
        System.in.read();
    }

    public static Unsafe getUnsafe(){
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            Unsafe unsafe = (Unsafe)f.get(null);
            return unsafe;
        }catch (Exception e ){
            e.printStackTrace();
        }
        return null;
    }
}
