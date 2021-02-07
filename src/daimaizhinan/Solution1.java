package daimaizhinan;

import java.util.Arrays;

public class Solution1 {
    //前序和中序 重建二叉树并返回
    public TreeNode reConstuctBinaryTree(int []pre,int []in){
        if(pre.length<1){
            return null;
        }
        if(pre.length==1){
            return new TreeNode(pre[0]);
        }
        int rootValue = pre[0];
        TreeNode root = new TreeNode(pre[0]);
        int index = 0;
        for(int i=0;i<in.length;i++){
            if(in[i]==rootValue){
                index=i;
                break;
            }
        }
        root.left = reConstuctBinaryTree(Arrays.copyOfRange(pre,1,index+1),Arrays.copyOfRange(in,0,index));
        root.right= reConstuctBinaryTree(Arrays.copyOfRange(pre,index+1,pre.length),Arrays.copyOfRange(in,index+1,pre.length));
        return root;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}