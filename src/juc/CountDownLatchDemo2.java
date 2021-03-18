/**
 * @(#)CountDownLatchDemo2.java, 2021-03-18.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package juc;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatchDemo2
 *
 * @author jiaxiangyu
 * @since 2021/03/18
 */
public class CountDownLatchDemo2 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        for(int i=1;i<=3;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"\t被灭");
                countDownLatch.countDown();
            },CountryEnum.forEach_CountryEnum(i).getRetMessage()).start();
        }
        try {
            countDownLatch.await();
            System.out.println(Thread.currentThread().getName()+"\t 秦称帝，一统华夏");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}