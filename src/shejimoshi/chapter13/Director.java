package shejimoshi.chapter13;

import shejimoshi.chapter13.Builder;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 8:53 下午
 */
public class Director {
    public void construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
