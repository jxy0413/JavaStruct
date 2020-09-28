package LinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ReverseLinkedList {
    public static ListNode reveseList(ListNode head){
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

    public ListNode mergeList(ListNode L1,ListNode L2){
        ListNode lTemp  = new ListNode(0);
        ListNode pre=lTemp;
        while(L1!=null&&L2!=null){
            if(L1.value<L2.value){
                pre.next = L1;
                L1=L1.next;
            }else{
                pre.next= L2;
                L2 = L2.next;
            }
            pre = pre.next;
        }
        if(L1!=null){
            pre.next = L1;
        }
        if(L2!=null){
            pre.next = L2;
        }
        return lTemp.next;
    }
    /**
     * 划分链表
     * @param head
     * @param value
     * @return
     */
    public static ListNode partition(ListNode head,int value){
        ListNode lessHead = new ListNode(0);
        ListNode moreHead = new ListNode(0);
        ListNode less = lessHead;
        ListNode more = moreHead;
        while (head!=null){
            //节点值小于x就插入到less_str里面
            if(head.value<value){
                lessHead.next=head;
                lessHead = head;   //完成链接后 lesshead指针后移
            }else{
                moreHead.next=head;
                moreHead = head;
            }
            head = head.next;
        }
        lessHead.next  = more.next;
        moreHead.next = null;
        return less.next;
    }

    public static ListNode reverseBeteen(ListNode head,int m,int n){
         int change_len = n-m+1;  //计算需要逆置的节点个数
         ListNode preHead = null; //初始化开始逆置节点的前驱
         ListNode result = head; //最终转换的链表头节点，除非特殊情况是head
         while(head!=null&&m>1){
             m--;
             preHead = head;
             head = head.next;
         }
         ListNode modifyListTtail = head; //指向当前的head
         ListNode newHead = null;

         while(head!=null&&change_len>0){
             ListNode next = head.next;
             head.next = newHead;
             newHead = head;
             head = next;
             change_len--;
         }
         modifyListTtail.next = head;
         //如果pre_head不空 说明不是从第一个节点开始逆转
        if(preHead!=null){
            preHead.next = newHead;
        }else{
            result = newHead;
        }
        return result;
    }

    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
           List list = new ArrayList();
           while (headA!=null){
                list.add(headA);
                headA = headA.next;
           }
           while (headB!=null){
               if(list.contains(headB)){
                   return headB;
               }
               headB = headB.next;
           }
           return null;
    }

    /**
     * 求两个链表公共的那个节点 返回那个
     * @param
     */
    public ListNode getSectionNode(ListNode headA,ListNode headB){
        int list_A_len = list_length(headA);
        int list_B_len = list_length(headB);
        if(list_A_len>list_B_len){
            headA  = forwardLongList(list_A_len,list_B_len,headA);
        }else{
            headB  = forwardLongList(list_B_len,list_A_len,headB);
        }
        while (headA!=null&&headB!=null){
            if(headA==headB){
                return headA; //找到了
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    /**
     * 是否有环  第一种
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head){
        HashSet set = new HashSet();
        while (head!=null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }

    /**
     *是否有环 第二种
     */
    public ListNode detectCycle2 (ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode meet = null; //相遇的节点
        while (fast!=null){
            slow = slow.next;  //先走一步
            fast = fast.next;  //slow走一步
            if(fast==null){
                return null;
            }
            fast = fast.next;   //fast再走一步
            if(fast==slow){
                meet = fast;  //meet是相遇的节点
                break;
            }
        }
        if(meet==null){
            return null;
        }
        while (head!=null&&meet!=null){
            if(head==meet){
                return head;
            }
            head = head.next;
            meet = meet.next;
        }
        return null;
    }

    private ListNode forwardLongList(int list_a_len, int list_b_len, ListNode head) {
        int dalta = list_a_len - list_b_len;
        while (head!=null&&dalta>0){
            head = head.next;
            dalta--;
        }
        return head;
    }

    /**
     * 求链表长度
     */
    public static int list_length(ListNode head){
        int len = 0;
        while (head!=null){
            len++;
            head = head.next;
        }
        return len;
    }

    /**
     * 多个排序
     * @param
     */
    public ListNode mergeList(List<ListNode>lists){
        List<ListNode> list = new ArrayList();
        for(int i=0;i<lists.size();i++){
            ListNode head = lists.get(i);
            while (head!=null){
                list.add(head);
                head = head.next;
            }
        }
        if(list.size()==0){
            return null;
        }
        list.sort(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return 0;
            }
        });
        ListNode node = new ListNode(0);
        for(int i=0;i<list.size();i++){
            node.next = list.get(i);
            node = node.next;
        }
        node.next=null;
        return node.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(15);
        ListNode l4 = new ListNode(14);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;
        ListNode head = l1;
//        while (head!=null){
//            System.out.println(head.value);
//            head = head.next;
//        }
//        ListNode listNode = reveseList(l1);
//        System.out.println("反转后******************************");
//        while (listNode!=null){
//            System.out.println(listNode.value);
//            listNode = listNode.next;
//        }
//        ListNode listNode1 = reverseBeteen(head, 2, 4);
        ListNode partition = partition(head, 7);
        while (partition!=null){
            System.out.println(partition.value);
            partition = partition.next;
        }
    }
}
class ListNode{
    int value; //值
    ListNode  next;  //指针域
    public ListNode(int value){
        this.value = value;
    }
}