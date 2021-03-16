package jianzhiwangyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/16 17:15
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 */
public class jianzhi3 {
    public ArrayList<Integer> printListFromTailToHead(Node listNode) {
          ArrayList <Integer> list = new ArrayList();
          Stack<Integer> stack = new Stack<>();
          while (listNode!=null){
              stack.add(listNode.val);
              listNode = listNode.next;
          }
          while (!stack.isEmpty()){
              list.add(stack.pop());
          }
          return list;
    }
}

class Node {
    int val;
    Node next = null;
    
    Node(int val) {
        this.val = val;
    }
}