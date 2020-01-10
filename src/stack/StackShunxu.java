package stack;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Stack;

/**
 * Created by jxy on 2020/1/5.
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class StackShunxu {
    public static void main(String[] args) {
        int [] pushA = {1,2,3,4,5};
        int [] pushB = {4,5,3,1,2};
        System.out.println(isPopOrder(pushA,pushB));
    }

    public static  boolean isPopOrder(int [] pushA,int [] pushB){
        if(pushA.length==0||pushB.length==0){
            return false;
        }
        Stack<Integer> stack =new Stack();
        //创一个变量
        int num = 0;
        for(int i=0;i<pushA.length;i++){
            //每次都直接加入
            stack.push(pushA[i]);

            while (!stack.isEmpty()&&stack.peek()==pushB[num]){
                stack.pop();
                num++;
            }
        }
        return  stack.isEmpty();
    }
}
