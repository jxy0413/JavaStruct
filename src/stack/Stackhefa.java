package stack;

import java.util.Queue;
import java.util.Stack;

public class Stackhefa {
     public boolean checkIsValueOrder(Queue<Integer> order){
         Stack<Integer> stack = new Stack<>();
         int n = order.size();
         for(int i=1;i<=n;i++){
             stack.push(i);
             while(!stack.isEmpty()&&order.peek()==stack.peek()){
                 stack.pop();
                 order.remove();
             }
         }
         if(!stack.isEmpty()){
             return false;
         }
         return true;
     }
}
