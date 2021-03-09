package juc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/9 9:24
 */
public class ContainerNotSafeDemo {
    public static void main(String[] args) {
        //Exception in thread "Thread18" Exception in thread "Thread24" java.util.ConcurrentModificationException
        notSafe();
    }
    
    public static void notSafe(){
        //List<String> list = new ArrayList<>();
        //解決方法一
        //List<String> list = new Vector<>();
        //解決方法二
        //List<String> list = Collections.synchronizedList(new ArrayList<>());
        //解決方法三
        List<String> list = new CopyOnWriteArrayList<>();//写时复制，读写分离
        for(int i=0;i<=30;i++){
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,9));
                System.out.println(list);
            },"Thread"+i).start();
        }
    }
}
