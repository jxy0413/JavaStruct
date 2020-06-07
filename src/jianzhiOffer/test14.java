package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-27
 * 输入一个链表，反转链表后，输出新链表的表头
 * 这个北林经常会考 第一次学习还是孟老师讲的数据结构
 */
public class test14 {
    public ListNode ReverseList(ListNode head){
        if(head==null){
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre=head;
            head = next;
        }
        return pre;
    }
}
