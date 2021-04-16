package jvm;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * Created by jxy on 2021/4/16 0016 17:19
 */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        myHashMap();
        System.out.println("=============");
        myWeakHashMap();
    }

    public static void myHashMap(){
        HashMap<Integer,String> map = new HashMap<>();
        Integer key = new Integer(1);
        String value = "HashMap";
        map.put(key,value);
        System.out.println(map);

        key = null;
        System.out.println(map);
        System.gc();
        System.out.println(map+"\t"+map.size());
    }

    public static void myWeakHashMap(){
        WeakHashMap<Integer,String> map = new WeakHashMap<>();
        Integer key = new Integer(2);
        String value = "WeakHashMap";
        map.put(key,value);
        System.out.println(map);

        key = null;
        System.out.println(map);
        System.gc();
        System.out.println(map+"\t"+map.size());
    }
}
