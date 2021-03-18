/**
 * @(#)MyThread.java, 2021-03-18.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package godofbigdata;

import java.util.TreeMap;

/**
 * MyThread
 *
 * @author jiaxiangyu
 * @since 2021/03/18
 */
public class MyThread extends Thread{
    public void run(){
        super.run();
        for(int i=0;i<500000;i++){
            System.out.println("i="+(i+1));
        }
    }
}
class Run{
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}