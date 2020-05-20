package jianzhiOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther jxy
 * @Date 2020-05-18
 */
public class test03 {
    /**
     * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         ArrayList<Integer> list =new ArrayList<>();
         while(listNode!=null){
             list.add(listNode.val);
             listNode = listNode.next;
         }
         Collections.reverse(list);
         return list;
    }
}

class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val) {
    this.val = val; }
}