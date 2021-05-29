package jianzhioffermeituan;

import apple.laf.JRSUIUtils.Tree;
import java.util.Arrays;

/**
 * @author jiaxiangyu
 * @date 2021/5/23 3:26 下午
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class jianzhi4 {
  public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
       if(pre.length == 0){
         return null;
       }
       if(pre.length == 1){
         return new TreeNode(pre[0]);
       }
       TreeNode root = new TreeNode(pre[0]);
       int rootValue = pre[0];
       int value = 0;
       for(int i=0 ;i<pre.length;i++){
         if (in[i] == rootValue){
             value = i;
             break;
         }
       }
    root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,value+1),Arrays.copyOfRange(in,0,value));
    root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,value+1,pre.length),Arrays.copyOfRange(in,value+1,in.length));
    return root;
  }
}
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

