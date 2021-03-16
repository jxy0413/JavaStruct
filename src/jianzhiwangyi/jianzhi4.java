package jianzhiwangyi;

import java.util.Arrays;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/16 18:29
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class jianzhi4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
          if(pre.length==0){
              return null;
          }
          int rootVal = pre[0];
          //数组长度仅为1的时候要处理
          if(pre.length==1){
              return new TreeNode(pre[0]);
          }
          //我们先找到root的位置，确定好前序和中序中的左子树和右子树
          TreeNode root = new TreeNode(rootVal);
          int rootIndex = 0;
          for(int i=0;i<in.length;i++){
              if(rootVal==in[i]){
                  rootIndex = i;
                  break;
              }
          }
          root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1),Arrays.copyOfRange(in,0,rootIndex));
          root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),Arrays.copyOfRange(in,rootIndex+1,in.length));
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