package jianzhioffermeituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * @author jiaxiangyu
 * @date 2021/5/23 3:17 下午
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * {67,0,24,58}  -----》[58,24,0,67]
 */
public class jianzhi3 {
  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
       Stack<Integer> stack = new Stack<>();
       ArrayList<Integer> list = new ArrayList<>();
       while (listNode != null){
         stack.add(listNode.val);
         listNode = listNode.next;
       }
       while (!stack.isEmpty()){
         list.add(stack.pop());
       }
       return list;
  }
}
class ListNode{
      int val;
      ListNode next = null;
      ListNode(int val) {
      this.val = val;
    }
}