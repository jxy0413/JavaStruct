package tree;

import java.util.ArrayList;

/**
 * Created by jxy on 2020/10/6  15:08
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int sum) {
           ArrayList<ArrayList<Integer>> result = new ArrayList<>();
           ArrayList<Integer> path =new ArrayList<>();
           int pathValue = 0;
           preOrder(root,pathValue,sum,path,result);
           return result;
    }

    private void preOrder(TreeNode root,int pathValue, int sum,ArrayList path, ArrayList<ArrayList<Integer>> result) {
        if(root==null){
            return;
        }
        //遍历一个节点更新一次路径值
        pathValue+=root.value;
        path.add(root.value);
        if(pathValue==sum&&root.left==null&&root.left==null){
            result.add(path);
        }
        preOrder(root.left,pathValue,sum,path,result);
        preOrder(root.right,pathValue,sum,path,result);
        pathValue-=root.value;
        path.remove(path.size()-1);
    }
}
