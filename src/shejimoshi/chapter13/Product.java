package shejimoshi.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 8:47 下午
 */
public class Product {
    List<String> parts = new ArrayList();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("产品 创建 --- ");
        for(String part : parts){
            System.out.println(part);
        }
    }
}
