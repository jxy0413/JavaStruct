/**
 * @(#)jianzhi24.java, 2021-03-19.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.ArrayList;

/**
 * jianzhi24
 *
 * @author jiaxiangyu
 * @since 2021/03/19
 * 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径
 * {10,5,12,4,7},22
 * [[10,5,7],[10,12]]
 */
public class jianzhi24 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        ArrayList<Integer> path = new ArrayList();
        this.find(root,target,result,path);
        return result;
    }
    
    private void find(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> path) {
        if(root==null){
            return;
        }
        path.add(root.val);
        target-=root.val;
        if(target==0&& root.right==null && root.left==null){
             result.add(path);
             return;
        }
        this.find(root.left,target,result,new ArrayList<>(path));
        this.find(root.right,target,result,new ArrayList<>(path));
    }
}