package LinkedList;

import java.util.Stack;

/**
 * Created by jxy on 2020/1/6.
 */
public class feidiguiLianbiao {

    //前序遍历  根左右
    public void preOrder(Node head){
        System.out.println("pre Order ...");
        if(head != null){
            Stack<Node> stack =new Stack();
            stack.push(head);
            while (!stack.isEmpty()){
                head = stack.pop();
                System.out.println(head.val+" ");
                if(head.right!=null){
                    stack.push(head.right);
                }
                if(head.left!=null){
                    stack.push(head.left);
                }
            }
        }
    }

    //中序遍历 左根右
    public void inOrderTravse(Node head){
        System.out.println("in Order:");
        if(head!=null){
            Stack<Node> stack =new Stack<>();
            while (!stack.isEmpty()|| head != null){
                if(head!=null){
                    //当当前节点压入栈 并将自己压入栈 将左孩子 作为当前节点
                    stack.push(head);
                    head = head.left;
                }else{
                    head = stack.pop();
                    System.out.println(head.val+" ");
                    head = head.right;
                }
            }
        }
    }

    //后序遍历 根 左 右
    public void posOrderTravrse(Node head){
        System.out.println("pos-order ");
        if(head != null){
            Stack<Node> stack1 = new Stack<>();
            Stack<Node> stack2 = new Stack<>();
            stack1.push(head);

            while (!stack1.isEmpty()){
                head = stack1.pop();
                stack2.push(head);
                if(head.left !=null){
                    stack1.push(head.left);
                }
                if(head.right != null){
                    stack1.push(head.right);
                }
            }

            while(!stack2.isEmpty()){
                System.out.println(stack2.pop().val+" ");
            }
        }
    }



}
class Node{
    int val;
    Node left;
    Node right;

    Node(){};

    Node(int val){
        this.val = val;
    }
}