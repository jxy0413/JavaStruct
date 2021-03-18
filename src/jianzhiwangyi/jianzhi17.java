/**
 * @(#)jianzhi17.java, 2021-03-17.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi17
 *
 * @author jiaxiangyu
 * @since 2021/03/17
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * {8,8,#,9,#,2,#,5},{8,9,#,2}
 */
public class jianzhi17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
          boolean result = false;
          if(root1!=null&&root2!=null){
              if(root1.val==root2.val){
                  result = HashRoot1HasRoo2(root1,root2);
              }
              //左孩子找到的话
              if(!result){
                  result = HashRoot1HasRoo2(root1.left,root2);
              }
              //又孩子找到的话
              if(!result){
                  result = HashRoot1HasRoo2(root1.right,root2);
              }
          }
          return result;
    }
    
    public boolean HashRoot1HasRoo2(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return HashRoot1HasRoo2(root1.left,root2.left) && HashRoot1HasRoo2(root1.right,root2.right);
    }
}