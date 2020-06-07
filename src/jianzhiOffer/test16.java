package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-27
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class test16 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2){
        boolean result = false;
        //当Tree1和Tree2都不为零的时候，才进行比较 否则返回false
        if(root2!=null&&root1!=null){
            //如果找到了对应的Tree2的根节点的点
            if(root1.val==root2.val){
                result = doesTree1HaveTree2(root1,root2);
            }
            //如果找不到 就找root的左节点当作起点
            if(!result){
                result =  HasSubtree(root1.left,root2);
            }
            //如果找不到 就找root的左节点当作起点
            if(!result){
                result = HasSubtree(root1.right,root2);
            }
        }
        return result;
    }

    private boolean doesTree1HaveTree2(TreeNode root1, TreeNode root2) {
        //如果都遍历完事了 就可以为true
        if(root2==null){
            return true;
        }
        //如果Tree2还没有遍历完 Tree1却遍历完了 返回flase
        if(root1==null){
            return  false;
        }
        //如果有其中的一个点 没有遍历上 返回false
        if(root1.val!= root2.val){
            return  false;
        }

        //如果根节点对应对应上了 那么就去分配自节点去匹配
        return doesTree1HaveTree2(root1.left,root2.left)&&doesTree1HaveTree2(root1.right,root2.right);
    }

}
