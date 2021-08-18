package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/7/25 5:50 下午
 */
public class jianzhi36 {
  public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
     if(pHead1 == null || pHead2 == null){
       return null;
     }
     ListNode p1 = pHead1;
     ListNode p2 = pHead2;
     while (p1 != p2){
       p1 = p1.next;
       p2 = p2.next;
       while (p1 != p2){
         if(p1 != p2){
           if(p1 == null){
             p1 = pHead2;
           }
           if(p2 == null){
             p2 = pHead1;
           }
         }
       }
     }
     return p1;
  }
}
