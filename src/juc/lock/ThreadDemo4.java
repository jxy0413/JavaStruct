package juc.lock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author jiaxiangyu
 * @date 2021/7/17 11:32 下午
 * list集合线程不安全
 */
public class ThreadDemo4 {

  public static void main(String[] args) {
    //创建ArrayList
    //java.util.ConcurrentModificationException
//    List<String> list = new ArrayList();
//    List<String> list = new Vector<>();
//    List<String> list = Collections.synchronizedList(new ArrayList<>());
    List<String> list = new CopyOnWriteArrayList<>();
    for (int i =0;i< 30;i++){
      new Thread(()->{
         list.add(UUID.randomUUID().toString().substring(0,8));
        System.out.println(list);
      },String.valueOf(i).toString()).start();
    }
  }
}
