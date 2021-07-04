package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/7/3 4:58 下午
 * {1,3,5},{2,4,6}
 * {1,2,3,4,5,6}
 */
public class jianzhi16 {
  public ListNode Merge(ListNode list1,ListNode list2) {
       if(list1 == null){
         return list2;
       }
       if(list2 == null){
         return list1;
       }
       ListNode mergeHead = null;
       ListNode current = null;
       while (list1 != null && list2 != null){
         if(list1.val <= list2.val){
           if(mergeHead == null){
              mergeHead = current = list1;
           }else{
              current.next = list1;
              current = current.next;
           }
           list1 = list1.next;
         }else{
           if(mergeHead == null){
             mergeHead = current = list2;
           }else{
             current.next = list2;
             current = current.next;
           }
           list2 = list2.next;
         }
       }
       if(list1 == null){
         current.next = list2;
       }
       if(list2 == null){
         current.next = list1;
       }
       return  mergeHead;
  }
}
