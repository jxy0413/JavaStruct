package tree;

/**
 * Created by jxy on 2019/11/28.
 */
public class HeroNode {
    public int no;
    public String name;
    public HeroNode left;
    public HeroNode right;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //写先序遍历的方法
    public void preOrder(){
        System.out.println(this);
        //递归向左子树前序遍历
        if(this.left!=null){
            this.left.preOrder();
        }


    }
}
