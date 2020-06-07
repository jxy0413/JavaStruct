package jianzhiOffer;

import java.util.Stack;

/**
 * @Auther jxy
 * @Date 2020-05-27
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class test20 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0||popA.length==0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        //用于标识弹出的位置
        int popIndex = 0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            //如果栈不空 且栈顶元素等于弹出序列K
            while(!stack.empty()&&stack.peek()==popA[popIndex]){
                //出栈
                stack.pop();
                popIndex++;
            }
        }
        return  stack.isEmpty();
    }
}
