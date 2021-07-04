package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/6/27 7:45 下午
 * 输入一个链表，输出一个链表，该输出链表包含原链表中从倒数第k个结点至尾节点的全部节点。
 * 如果该链表长度小于k，请返回一个长度为 0 的链表。
 */
//public class jianzhi14 {
//  public ListNode FindKthToTail (ListNode pHead, int k) {
//    // write code here
//    if(pHead == null && k<=0){
//      return null;
//    }
//    ListNode fast = pHead;
//    while (fast!=null && k>=0){
//      fast = fast.next;
//      k--;
//    }
//    if(k > 0){
//      return null;
//    }
//    ListNode slow = pHead;
//    while (fast!=null){
//      slow = slow.next;
//      fast = fast.next;
//    }
//    return slow;
//  }
//}
//class ListNode{
//  int val;
//  ListNode next = null;
//  ListNode(int val) {
//    this.val = val;
//  }
//}