package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-27
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class test13 {
    public ListNode FineKthToTail(ListNode head,int k){
        ListNode pre = null,p=null;
        //两个指针都指向头节点
        p=head;
        pre= head;
        //记录K数
        int a= k;
        //记录节点数量
        int count = 0;
        //p指针先跑并且记录节点数 当P指针跑了k-1个节点后，pre指针开始跑
        //当p指针跑到最后 pre指针指的就是倒数第k个节点
        while (p!=null){
            p=p.next;
            count++;
            if(k<1){
                pre=pre.next;
            }
            k--;
        }
        //如果节点小于所求的倒数第k个节点 则返回空
        if(count<a){
            return null;
        }
        return pre;
    }
}
