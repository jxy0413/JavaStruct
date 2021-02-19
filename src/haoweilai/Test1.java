package haoweilai;

import java.util.LinkedList;
import java.util.Queue;

public class Test1 {

    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node head2 = new Node(2);
        Node head3 = new Node(3);

        head1.left = head2;
        head1.right=head3;

        print(head1);
    }

    public static void print(Node head){
        if(head==null){
            return;
        }
        Node last = head;
        Node nList = null;
        int level = 1;
        System.out.print("Level "+level++ +" : ");
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(head);
        while (!queue.isEmpty()){
            head = queue.poll();
            System.out.print(head.value);
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
