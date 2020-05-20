package jianzhiOffer;

import java.util.Stack;

/**
 * @Auther jxy
 * @Date 2020-05-20
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class test05 {
    Stack<Integer>stack1 = new Stack<Integer>();
    Stack<Integer>stack2 = new Stack<Integer>();

    /**
     * 入队列的
     * @param node
     */
    public int push(int node){
         return stack1.push(node);
    }

    /**
     * 出队列的
     */
    public int pop(){
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is Empty");
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
