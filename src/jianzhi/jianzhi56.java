package jianzhi;

public class jianzhi56 {
    public ListNode deleteDuplication(ListNode pHead) {
         if(pHead==null||pHead.next==null){
             return pHead;
         }
         ListNode Head = new ListNode(0);
         Head.next = pHead;
         ListNode pre =Head;
         ListNode last = Head.next;
         while (last!=null){
             if(last!=null&&last.val==last.next.val){
                  while (last!=null&&last.val==last.next.val){
                      last = last.next;
                  }
                 pre.next =last.next;
                 last = last.next;
             }else{
                 pre = pre.next;
                 last = last.next;
             }
         }
         return Head.next;
    }
}
