/**
 * @(#)jianzhi37.java, 2021-04-06.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi37
 *
 * @author jiaxiangyu
 * @since 2021/04/06
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class jianzhi37 {
    public int TreeDepth(TreeNode root) {
         if(root==null){
             return 0;
         }
         int leftHeight = TreeDepth(root.left);
         int rightHeight = TreeDepth(root.right);
         return leftHeight > rightHeight? leftHeight+1:rightHeight+1;
    }
}