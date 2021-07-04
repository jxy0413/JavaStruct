package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/7/3 6:11 下午\
 * 比如：    源二叉树
 *             8
 *            /  \
 *           6   10
 *          / \  / \
 *         5  7 9 11
 *         镜像二叉树
 *             8
 *            /  \
 *           10   6
 *          / \  / \
 *         11 9 7  5
 */
public class jianzhi18 {
  public TreeNode Mirror(TreeNode pRoot){
     if(pRoot == null){
       return pRoot;
     }
     if(pRoot.right == null && pRoot.left == null){
       return pRoot;
     }
     //处理根结点
     TreeNode temp = pRoot.left;
     pRoot.left = pRoot.right;
     pRoot.right = temp;
     Mirror(pRoot.left);
     Mirror(pRoot.right);
     return pRoot;
  }
}
