package jvm;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2022/2/3 1:09 下午
 *
 */
public class Demo2_3 {
    static int _4MB = 1024 * 1024 * 4;

    public static void main(String[] args) {
        soft();
    }

    public static void soft(){
        List<SoftReference<byte[]>> list = new ArrayList<>();

        //引用队列
        ReferenceQueue<byte[]> queue = new ReferenceQueue<>();

        for(int i = 0; i<5; i++){
            //关联了引用队列,当软引用关联的byte[]被回收时，软引用自己会加入到queue时候
            SoftReference<byte[]> b = new SoftReference(new byte[_4MB], queue);
            System.out.println(b.get());
            list.add(b);
            System.out.println(list.size());
        }
        System.out.println("循环结束：" + list.size());

        //从队列中获取无用的软引用对象
        Reference<? extends byte[]> poll = queue.poll();
        while (null != poll){
            list.remove(poll);
            poll = queue.poll();
        }

        System.out.println("========================");

        for(SoftReference<byte[]> reference : list){
            System.out.println(reference.get());
        }
    }
}
