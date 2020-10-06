package tree;

/**
 * Created by jxy on 2020/10/6 14:13
 */
public class PreOrderPrint {
    public static void main(String[] args) {
        TreeNode a= new TreeNode(1);
        TreeNode b= new TreeNode(2);
        TreeNode c= new TreeNode(3);
        TreeNode d= new TreeNode(4);
        TreeNode e= new TreeNode(5);
        TreeNode f= new TreeNode(6);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        preorder_print(a,0);
    }
    public static void preorder_print(TreeNode node,int layer){
        if(node==null){
            return;
        }
        for(int i=0;i<layer;i++){
            System.out.print("-----");
        }
        System.out.print(node.value+"\n");
        preorder_print(node.left,layer+1);
        preorder_print(node.right,layer+1);
    }
}
class  TreeNode{
    public int value;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x){
        this.value = x;
        left=null;
        right=null;
    }
}