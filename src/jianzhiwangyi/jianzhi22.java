/**
 * @(#)jianzhi22.java, 2021-03-18.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Queue;

/**
 * jianzhi22
 *
 * @author jiaxiangyu
 * @since 2021/03/18
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * {5,4,#,3,#,2,#,1}
 */
public class jianzhi22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        
        if(root==null){
            return null;
        }
        queue.add(root);
        while (queue.size()>0){
            TreeNode temp = queue.remove(0);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}