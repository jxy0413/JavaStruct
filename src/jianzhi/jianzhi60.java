package jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class jianzhi60 {
    /**
     *按层次输出二叉树
     * 访问根节点，并将根节点入队。
     * 当队列不空的时候，重复以下操作。
     * 1、弹出一个元素。作为当前的根节点。
     * 2、如果根节点有左孩子，访问左孩子，并将左孩子入队。
     * @param pRoot
     * @return
     */
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot==null){
            return null;
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        //使用队列 先进先出
        Queue<TreeNode> layer = new LinkedList<TreeNode>();
        ArrayList<Integer> layerList = new ArrayList<>();
        layer.add(pRoot);

        int start = 0,end =1;
        while (!layer.isEmpty()){
            TreeNode cur = layer.remove();
            layerList.add(cur.val);
            start++;
            if(cur.left!=null){
                layer.add(cur.left);
            }
            if(cur.right!=null){
                layer.add(cur.right);
            }
            if(start==end){
                end =layer.size();
                start = 0;
                result.add(layerList);
                layerList = new ArrayList<>();
            }
        }
        return result;
    }
}
