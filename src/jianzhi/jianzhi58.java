package jianzhi;

public class jianzhi58 {
    public boolean isSymmetrical(TreeNode pRoot){
           if(pRoot==null){
               return true;
           }
           return comRoot(pRoot.left,pRoot.right);
    }

    private boolean comRoot(TreeNode left, TreeNode right) {
        if(left==null){
            return right==null;
        }
        if(right==null){
            return false;
        }
        if(right.val!=left.val){
            return false;
        }
        return comRoot(right.right,left.left)&&comRoot(right.left,left.right);
    }
}
