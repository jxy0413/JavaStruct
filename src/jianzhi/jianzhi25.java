package jianzhi;

public class jianzhi25 {
}
class RandomListNode{
    int label;
    RandomListNode next = null;
    RandomListNode random = null;
    RandomListNode(int label){
        this.label = label;
    }

    public RandomListNode clone(RandomListNode pHead){
        if(pHead==null){
            return null;
        }
        RandomListNode currentNode = pHead;
        while (currentNode!=null){
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode  = currentNode.next;
            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }
        currentNode = pHead;
        //复制随机的节点
        while (currentNode!=null){
            if(currentNode.random==null){
                currentNode.next.random = null;
            }else{
                currentNode.next.random = currentNode.random.next;
            }
            currentNode = currentNode.next.next;
        }
        //拆分链表
        currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while (currentNode!=null){
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            if(cloneNode.next==null){
                cloneNode = null;
            }else{
                cloneNode = cloneNode.next.next;
            }
            currentNode = currentNode.next;
        }
        return  pCloneHead;
    }
}