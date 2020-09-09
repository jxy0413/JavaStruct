package stack;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedDeque;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack();
        if(stack.isEmpty()){
            System.out.println("S is empty! ");
        }
        stack.push(5);
        stack.push(6);
        stack.push(10);
        System.out.println("S.top "+stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("s.top "+stack.peek());
        System.out.println("size "+stack.size());
    }

    Queue <Integer>queue = new ConcurrentLinkedDeque();
    public  int pop(){
        Integer x = queue.peek();
        queue.remove();
        return x;
    }
    public int top(){
        return queue.peek();
    }
    public boolean empty(){
        return queue.isEmpty();
    }
    public void push(int x){
        Queue <Integer>queueTemp = new ConcurrentLinkedDeque();
        while (!queue.isEmpty()){
            queueTemp.add(queue.remove());
        }
        while (!queueTemp.isEmpty()){
            queue.add(x);
            queue.add(queueTemp.remove());
        }
    }
}
