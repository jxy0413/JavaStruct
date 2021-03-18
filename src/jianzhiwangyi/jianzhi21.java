/**
 * @(#)jianzhi21.java, 2021-03-18.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.Stack;

/**
 * jianzhi21
 *
 * @author jiaxiangyu
 * @since 2021/03/18
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * [1,2,3,4,5],[4,3,5,1,2]
 */
public class jianzhi21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
          if(pushA.length==0||popA.length==0){
              return false;
          }
          int index = 0;
          Stack<Integer> stack = new Stack<>();
          for(int i=0;i<popA.length;i++){
              stack.push(pushA[i]);
              while (!stack.isEmpty()&&popA[index]==stack.peek()){
                  stack.pop();
                  index++;
              }
          }
          return stack.isEmpty();
    }
}