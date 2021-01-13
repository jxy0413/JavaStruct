package jianzhi;

import java.util.Stack;

public class jianzhi5 {
      Stack<Integer> stack1 = new Stack();
      Stack<Integer> stack2 = new Stack();

      public void push(int value){
          stack1.push(value);
      }

      public int pop(){
          if(stack1.isEmpty()&&stack2.isEmpty()){
              throw  new RuntimeException("异常......");
          }
          if(stack2.isEmpty()){
              while (!stack1.isEmpty()){
                  stack2.push(stack1.pop());
              }
          }
          return stack2.pop();
      }
}
