/**
 * @(#)jianzhi31.java, 2021-03-30.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.ArrayList;
import java.util.List;

/**
 * jianzhi31
 *
 * @author jiaxiangyu
 * @since 2021/03/30
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class jianzhi31 {
    public int NumberOf1Between1AndN_Solution(int n) {
          List list = new ArrayList();
        System.out.println(list.stream().count());
        return 1;
    }
    
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.stream().count());
    }
}