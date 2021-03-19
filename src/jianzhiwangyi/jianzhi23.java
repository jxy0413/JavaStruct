/**
 * @(#)jianzhi23.java, 2021-03-19.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.Arrays;
import java.util.Stack;

/**
 * jianzhi23
 *
 * @author jiaxiangyu
 * @since 2021/03/19
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。（ps：我们约定空树不是二叉搜素树）
 * [4,8,6,12,16,14,10]
 */
public class jianzhi23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int[] arr = sequence.clone();
        Arrays.sort(arr);
        return isOrder(arr,sequence);
    }
    
    private boolean isOrder(int[] arr, int[] sequence) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
            while (!stack.isEmpty()&&sequence[index]==stack.peek()){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}