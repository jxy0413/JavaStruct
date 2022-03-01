package shuzu;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author jiaxiangyu
 * @date 2022/2/26 8:48 上午
 */
public class ZiBinary {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null){
            return res;
        }

        //存放奇数层的节点
        Stack<TreeNode> stack1 = new Stack<>();
        stack1.push(pRoot);
        //存放偶数层的节点
        Stack<TreeNode> stack2 = new Stack<>();
        int level = 1;

        while (!stack1.isEmpty() || !stack2.isEmpty()){
            //处理奇数层
            if(level % 2 != 0){
                ArrayList<Integer> list = new ArrayList<>();
                while (!stack1.isEmpty()){
                    TreeNode node = stack1.pop();
                    if(node != null){
                        list.add(node.val);
                        stack2.push(node.left);
                        stack2.push(node.right);
                    }
                }
              //收集当层数据
              if(!list.isEmpty()){
                  res.add(list);
                  level++;
              }
            }else{
                //处理偶数层
                ArrayList<Integer> list = new ArrayList<>();
                while (!stack2.isEmpty()){
                    TreeNode node = stack2.pop();
                    if(node != null){
                        list.add(node.val);
                        stack1.push(node.right);
                        stack1.push(node.left);
                    }
                }
                if(!list.isEmpty()){
                    res.add(list);
                    level++;
                }
            }
        }
        return res;
    }
}
class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val){
        this.val = val;
    }
}