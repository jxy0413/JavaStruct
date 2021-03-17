/**
 * @(#)jianzhi9.java, 2021-03-17.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi9
 *
 * @author jiaxiangyu
 * @since 2021/03/17
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class jianzhi9 {
    public int jumpFloorII(int target) {
        if(target<1){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target>1){
            return 2 * jumpFloorII(target-1);
        }
        return 1;
    }
}