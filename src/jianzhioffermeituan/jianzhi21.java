package jianzhioffermeituan;

import java.util.ArrayList;

/**
 * @author jiaxiangyu
 * @date 2021/7/13 9:54 下午
 * {5,4,#,3,#,2,#,1}
 * [5,4,3,2,1]
 */
public class jianzhi21 {
  public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<TreeNode> queue = new ArrayList<>();
    if(root == null){
      return list;
    }
    queue.add(root);
    while (!queue.isEmpty()){
      TreeNode remove = queue.remove(0);
      if(remove.left!=null){
        queue.add(remove.left);
      }
      if(remove.right!=null){
        queue.add(remove.right);
      }
      list.add(root.val);
    }
    return list;
  }
}
