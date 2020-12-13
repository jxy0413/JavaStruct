package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jxy on 2020/10/8  9:50
 * 求最近的公共祖先
 */
public class LowestCommonAnctor {
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        List<TreeNode> path = new ArrayList<>();
        List<TreeNode> node_p_path = new ArrayList<>();
        List<TreeNode> node_q_path = new ArrayList<>();
        int finish=0; //记录是否完成搜索的变量finish
        preorder(root,o1,path,node_p_path,finish);
        //清空
        path.clear();
        finish=0;
        preorder(root,o2,path,node_q_path,finish);
        int path_len = 0;
        if(node_p_path.size()<node_q_path.size()){
            path_len = node_p_path.size();
        }else{
            path_len = node_q_path.size();
        }
        int res=0;
        for(int i=0;i<path_len;i++){
              if(node_p_path.get(i).equals(node_q_path.get(i))){
                  res=node_p_path.get(i).value;
              }
        }
        return res;
    }
    public void preorder(TreeNode root, int key, List<TreeNode> path,List<TreeNode> result,int finish){
        if(root==null||finish==1){
            return;
        }
        path.add(root);
        if(root.value==key){
            finish=1;
            result=path;
        }
        preorder(root.left,key,path,result,finish);
        preorder(root.right,key,path,result,finish);
        path.remove(path.size()-1);
    }
}
