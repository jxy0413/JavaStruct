/**
 * @(#)jianzhi18.java, 2021-03-18.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi18
 *
 * @author jiaxiangyu
 * @since 2021/03/18
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * {8,6,10,5,7,9,11}
 * {8,10,6,11,9,7,5}
 */
public class jianzhi18 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot==null){
            return pRoot;
        }
        if(pRoot.left==null&&pRoot.right==null){
            return null;
        }
        //处理根节点
        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;
        
        //处理左子树
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}