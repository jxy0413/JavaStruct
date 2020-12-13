package tree;


import java.util.ArrayList;
import java.util.LinkedList;


/**
 * Created by jxy on 2020/10/8  11:09
 */
public class Cengjibianli {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
         if(root==null){
             return new ArrayList<>();
         }
         //建立一个二维的list和用来BFS的queuq(用LinkedList实现)
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        LinkedList<TreeNode> queue = new LinkedList();
        //将根节点放入到队列中，然后不断的遍历队列
        queue.add(root);
        while(queue.size()>0){
            //获取当前队列的长度 相当于这层节点的个数
             int size = queue.size();
             ArrayList<Integer> tmp = new ArrayList();
             for(int i=0;i<size;i++){
                 TreeNode t = queue.remove();
                 tmp.add(t.value);
                 if(t.left!=null){
                     queue.add(t.left);
                 }
                 if(t.right!=null){
                     queue.add(t.right);
                 }
             }
             list.add(tmp);
        }
         return list;
    }
}
