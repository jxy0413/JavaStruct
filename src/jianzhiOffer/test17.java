package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-27
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 * 左右子树换
 */
public class test17 {
    public void Mirror(TreeNode root){
        TreeNode temp = null;
        if(root!=null){
            temp = temp.left;
            temp.left =temp.right;
            temp.right = temp;
            if(root.left!=null){
                Mirror(root.left);
            }
            if(root.right!=null){
                Mirror(root.right);
            }
        }
    }
}
