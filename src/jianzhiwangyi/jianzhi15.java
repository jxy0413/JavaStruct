/**
 * @(#)jianzhi15.java, 2021-03-17.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi15
 *
 * @author jiaxiangyu
 * @since 2021/03/17
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class jianzhi15 {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    
    public static void main(String[] args) {
        jianzhi15 jianzhi15 = new jianzhi15();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        ListNode listNode = jianzhi15.ReverseList(listNode1);
        while (listNode!=null){
            System.out.println(listNode.value);
            listNode = listNode.next;
        }
    }
}