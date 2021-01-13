package jianzhi;
import java.util.ArrayList;
import java.util.Stack;

public class jianzhi3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack = new Stack();
        ArrayList<Integer> list = new ArrayList();
        while(listNode!=null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        while(stack.empty()!=true){
            list.add(stack.pop());
        }
        return list;
    }
}
class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val){
        this.val =val;
    }
}