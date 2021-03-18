/**
 * @(#)jianzhi16.java, 2021-03-17.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi16
 *
 * @author jiaxiangyu
 * @since 2021/03/17
 *输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class jianzhi16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode list3 = list1;
        while (list1!=null&&list2!=null){
            if(list1.value<=list2.value){
                list3.next = list1;
                list1 = list1.next;
            }
            if(list2.value<list1.value){
                list3.next = list2;
                list2 = list2.next;
            }
        }
        if(list1!=null){
            list3.next = list1;
            list1 = list1.next;
        }
        if(list2!=null){
            list3.next = list2;
            list2 = list2.next;
        }
        return list3;
    }
}