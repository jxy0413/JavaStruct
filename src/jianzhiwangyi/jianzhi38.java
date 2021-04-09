/**
 * @(#)jianzhi38.java, 2021-04-06.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi38
 *
 * @author jiaxiangyu
 * @since 2021/04/06
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 * 平衡二叉树（Balanced Binary Tree），
 * 具有以下性质：它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
 */
public class jianzhi38 {
      public boolean IsBalanced_Solution(TreeNode root) {
           if(root==null){
               return true;
           }
           return Math.abs(getMath(root.left)-getMath(root.right)) <= 1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
      }
      public int getMath(TreeNode root){
          if(root==null){
              return 0;
          }
          return getMath(root.left) > getMath(root.right) ? getMath(root.left)+1 : getMath(root.right) + 1;
      }
}