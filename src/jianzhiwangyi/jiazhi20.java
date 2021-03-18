/**
 * @(#)jiazhi20.java, 2021-03-18.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.Stack;

/**
 * jiazhi20
 *
 * @author jiaxiangyu
 * @since 2021/03/18
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class jiazhi20 {
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> dataStack = new Stack<>();
    public void push(int node) {
         dataStack.push(node);
         if(minStack.isEmpty()||node<minStack.peek()){
             minStack.push(node);
         }else{
             minStack.push(minStack.peek());
         }
    }
    
    public void pop() {
         dataStack.pop();
         minStack.pop();
    }
    
    public int top() {
         return dataStack.peek();
    }
    
    public int min() {
         return minStack.peek();
    }
}