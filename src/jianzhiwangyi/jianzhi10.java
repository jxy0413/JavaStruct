/**
 * @(#)jianzhi10.java, 2021-03-17.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi10
 *
 * @author jiaxiangyu
 * @since 2021/03/17
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 */
public class jianzhi10 {
    public int rectCover(int target) {
          if(target<0){
              return 0;
          }
          if(target==1){
              return 1;
          }
          if(target==2){
              return 2;
          }
          return rectCover(target-1)+rectCover(target-2);
    }
}