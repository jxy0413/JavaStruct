package juc.lock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author jiaxiangyu
 * @date 2021/7/17 11:59 下午
 */
public class ThreadDemo5 {
//java.util.ConcurrentModificationException
  public static void main(String[] args) {
//    Set<String> set = new CopyOnWriteArraySet<>();
    Map<String,String> map = new ConcurrentHashMap<>();
    for(int i=0; i<3000; i++){
      new Thread(()->{
        map.put(UUID.randomUUID().toString().substring(0,8), UUID.randomUUID().toString().substring(0,8));
        System.out.println(map);
      },String.valueOf(i)).start();
    }
  }
}
