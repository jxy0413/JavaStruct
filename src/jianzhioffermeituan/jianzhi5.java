package jianzhioffermeituan;

import java.util.Stack;

/**
 * @author jiaxiangyu
 * @date 2021/6/26 5:44 下午
 * 用两个栈来实现一个队列，分别完成在队列尾部插入整数(push)和在队列头部删除整数(pop)的功能。 队列中的元素为int类型。保证操作合法，即保证pop操作时队列内已有元素。
 */
public class jianzhi5 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
       stack1.push(node);
    }

    public int pop(){
        if(stack1.isEmpty() && stack2.isEmpty()){
          throw new RuntimeException("queue is empty");
        }
        if(stack2.isEmpty()){
          while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
          }
        }
        return stack2.pop();
    }
}
