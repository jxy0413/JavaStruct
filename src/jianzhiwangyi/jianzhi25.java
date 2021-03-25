/**
 * @(#)jianzhi25.java, 2021-03-19.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi25
 *
 * @author jiaxiangyu
 * @since 2021/03/19
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点），
 * 请对此链表进行深拷贝，并返回拷贝后的头结点。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class jianzhi25 {
    public RandomListNode Clone(RandomListNode pHead) {
         if(pHead==null){
             return null;
         }
         //复制链表
         RandomListNode currentNode = pHead;
         while (currentNode!=null){
             RandomListNode newCurrentNode = new RandomListNode(currentNode.lebel);
             RandomListNode nextNode = currentNode.next;
             currentNode.next = newCurrentNode;
             newCurrentNode.next = nextNode;
             currentNode = nextNode;
         }
         //复制链表
         currentNode = pHead;
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
         RandomListNode clonePre =  pHead.next;
         while (currentNode!=null){
             RandomListNode cloneNode = currentNode.next;
             currentNode.next = cloneNode.next;
             if(cloneNode.next==null){
                 cloneNode.next = null;
             }else{
                 cloneNode.next = cloneNode.next.next;
             }
             currentNode = currentNode.next;
         }
         return clonePre;
    }
}
class RandomListNode{
    int lebel;
    RandomListNode next = null;
    RandomListNode random = null;
    
    RandomListNode(int label){
        this.lebel = label;
    }
}