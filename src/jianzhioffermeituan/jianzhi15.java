package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/6/27 7:57 下午
 */
public class jianzhi15 {
  public ListNode ReverseList(ListNode head) {
     ListNode pre = null;
     ListNode next = null;
     while (head != null){
       next = head.next;
       head.next = pre;
       pre = head;
       head = next;
     }
     return pre;
  }
}
class ListNode{
  int val;
  ListNode next = null;
  ListNode(int val) {
    this.val = val;
  }
}