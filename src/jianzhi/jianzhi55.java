package jianzhi;

public class jianzhi55 {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast!=null&&slow!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null||slow==null){
            return null;
        }
        slow = pHead;
        while (slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return  slow;
    }
}
