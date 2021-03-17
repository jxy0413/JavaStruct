package jianzhiwangyi;

import java.util.Stack;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/16 19:34
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class jianzhi5 {
    
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        if (stack1.isEmpty() || stack2.isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
