/**
 * @(#)jianzhi35.java, 2021-03-30.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi35
 * 输入两个链表，找出它们的第一个公共结点。（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 * @author jiaxiangyu
 * @since 2021/03/30
 */
public class jianzhi35 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
          if(pHead1==null||pHead2==null){
              return null;
          }
          ListNode p1 = pHead1;
          ListNode p2 = pHead2;
          while (p1 != p2){
              p1 = p1.next;
              p2 = p2.next;
              if(p1!=p2){
                  if(p1==null){
                      p1 = pHead2;
                  }
                  if(p2==null){
                      p2 = pHead1;
                  }
              }
          }
          return p1;
    }
}