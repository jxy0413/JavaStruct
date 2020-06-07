package jianzhiOffer;

import java.util.Stack;

/**
 * @Auther jxy
 * @Date 2020-05-27
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 */
public class test19 {
    Stack<Integer> dataStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
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
