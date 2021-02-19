package haoweilai;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node head2 = new Node(2);
        Node head3 = new Node(3);

        head1.left = head2;
        head1.right=head3;

        printByLevel(head1);
    }

    public static void printByLevel(Node head){
        if(head==null){
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        int level = 1;
        Node last = head;
        Node nList = null;
        queue.offer(head);
        System.out.print("Level "+(level++)+" : ");
        while (!queue.isEmpty()){
            head = queue.poll();
            System.out.print(head.value+" ");
            if(head.left!=null){
                queue.offer(head.left);
                nList = head.left;
            }
            if(head.right!=null){
                queue.offer(head.right);
                nList = head.right;
            }
            if(head==last&&!queue.isEmpty()){
                System.out.print("\nLevel"+(level++)+" : ");
                last = nList;
            }
        }
        System.out.println();
    }
}
class Node{
    public int value;
    public Node left;
    public Node right;

    public Node(int data){
        this.value = data;
    }
}