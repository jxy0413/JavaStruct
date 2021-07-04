package jianzhioffermeituan;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * {8,8,#,9,#,2,#,5},{8,9,#,2}
 * true
 * @author jiaxiangyu
 * @date 2021/7/3 5:59 下午
 */
public class jianzhi17 {
  public boolean HasSubtree(TreeNode root1,TreeNode root2) {
      boolean result = false;
      if(root1 != null && root2 != null){
        if(root1.val == root2.val){
          result = doesTree1HaveTree2(root1,root2);
        }
        if(!result){
          result = HasSubtree(root1.left, root2);
        }
        if(!result){
          result = HasSubtree(root1.right, root2);
        }
      }
      return result;
  }

  public static boolean doesTree1HaveTree2(TreeNode root1, TreeNode root2){
    if(root2 == null){
      return true;
    }
    if(root1 == null){
      return false;
    }
    if(root1.val != root2.val){
      return false;
    }
    return doesTree1HaveTree2(root1.left, root2.left) && doesTree1HaveTree2(root1.right, root2.right);
  }
}
