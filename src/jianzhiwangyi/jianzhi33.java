/**
 * @(#)jianzhi33.java, 2021-03-30.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.ArrayList;

/**
 * jianzhi33
 *
 * @author jiaxiangyu
 * @since 2021/03/30
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * 输入 7 输出 8
 */
public class jianzhi33 {
    public static int GetUglyNumber_Solution(int index) {
         if(index==0){
             return 0;
         }
         ArrayList<Integer> list = new ArrayList<>();
         int i2 = 0;
         int i3 = 0;
         int i5 = 0;
         list.add(1);
         while (list.size()<index){
             int n2 = list.get(i2) * 2;
             int n3 = list.get(i3) * 3;
             int n5 = list.get(i5) * 5;
             int min = Math.min(n2,Math.min(n3,n5));
             list.add(min);
             if(min==n2){
                 i2++;
             }
             if(min==n3){
                 i3++;
             }
             if(min==n5){
                 i5++;
             }
         }
         return list.get(list.size()-1);
    }
    
    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(7));
    }
}