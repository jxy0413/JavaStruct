package shuzu;



import java.util.LinkedList;

/**
 * @author jiaxiangyu
 * @date 2022/2/28 9:02 上午
 */
public class AddInList {

    private static void putData(LinkedList<Integer> s1, ListNode head1){
        if(s1 == null){
            s1 = new LinkedList<>();
        }
        while (head1 != null){
            s1.push(head1.val);
            head1 = head1.next;
        }
    }

    public ListNode addInList(ListNode head1, ListNode head2){
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        //入栈
        putData(list1, head1);
        putData(list2, head2);
        ListNode newNode = null;
        ListNode head = null;
        int carry = 0; //标志进位
        while (!list1.isEmpty() || !list2.isEmpty() || carry != 0){
            int x = (list1.isEmpty()) ? 0 : list1.pop();
            int y = (list2.isEmpty()) ? 0 : list2.pop();
            int sum = x + y + carry;
            carry = carry / 10;
            //将计算放入新节点
            newNode = new ListNode(sum % 10);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
}
class ListNode{
    int val;
    ListNode next = null;

    public ListNode(int val){
        this.val = val;
    }
}