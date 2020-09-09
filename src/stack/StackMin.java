package stack;

import java.util.Stack;

public class StackMin {
     Stack<Integer> data = new Stack(); //数据栈
     Stack<Integer> min = new Stack(); //最小值站

     public  void push(int x){
         if(min.isEmpty()){
             min.push(x);
         }else{
             if(min.peek()>x){
                 min.push(x);
             }else{
                 min.push(min.peek());
             }
         }
         data.push(x);
     }

     public int top(){
         return data.peek();
     }

     public void pop(){
         data.pop();
         min.pop();
     }

     public int getMin(){
         return min.peek();
     }
}
