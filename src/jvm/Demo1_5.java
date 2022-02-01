package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2022/2/1 11:11 上午
 * -Xmx
 */
public class Demo1_5 {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList();
            String a = "hello";
            while (true){
                list.add(a);
                a = a + a;
                i++;
            }
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
