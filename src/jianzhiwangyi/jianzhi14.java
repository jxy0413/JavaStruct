/**
 * @(#)jianzhi14.java, 2021-03-17.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi14
 *
 * @author jiaxiangyu
 * @since 2021/03/17
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * {1,2,3,4,5},1
 */
public class jianzhi14 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if(pHead==null||k<0){
            return null;
        }
        ListNode fast = pHead;
        while (k>1 && fast!=null){
            k--;
            fast = fast.next;
        }
        if(fast==null){
            return null; //k比整个链表还大
        }
        ListNode slow = pHead;
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        jianzhi14 jianzhi14 = new jianzhi14();
        ListNode listNode = jianzhi14.FindKthToTail(listNode1, 3);
        System.out.println(listNode.value);
    }
}
class ListNode{
    public int value;
    ListNode next = null;
    public ListNode(int val){
        this.value = val;
    }
}