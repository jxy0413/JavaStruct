package changkao;



/**
 * @author jiaxiangyu
 * @date 2021/8/22 4:12 下午
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Test1 {
   public ListNode ReverseList(ListNode head){
       ListNode next = null;
       ListNode pre = null;
       while (head != null){
          next = head.next;
          head.next = pre;
          pre = head;
          head = next;
       }
       return pre;
   }

   class ListNode{
     int val;
     ListNode next =null;

     ListNode (int val){
       this.val = val;
     }
   }

}

