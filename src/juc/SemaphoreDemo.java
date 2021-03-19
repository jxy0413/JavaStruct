/**
 * @(#)Semaphore.java, 2021-03-18.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package juc;

import java.util.concurrent.Semaphore;

/**
 * Semaphore
 *
 * @author jiaxiangyu
 * @since 2021/03/18
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3); //模拟3个停车位
        for(int i=1;i<=6;i++){ //模拟6部汽车
        
        }
    }
}