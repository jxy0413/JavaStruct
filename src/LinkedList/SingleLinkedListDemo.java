package LinkedList;

/**
 * Created by Cookie on 2019/10/15.
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        //先创建链表
        HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
        HeroNode hero2 = new HeroNode(2,"李逵","黑旋风");
        HeroNode hero3 = new HeroNode(3,"吴用","智多星");
        HeroNode hero4 = new HeroNode(4,"林冲","豹子头");
        HeroNode hero5 = new HeroNode(5,"贾相宇","君临天下");
        HeroNode hero6 = new HeroNode(6,"jxy","jltx");
        HeroNode hero7 = new HeroNode(7,"关羽","关二爷");


        SingleLinkedList singleLinkedList = new SingleLinkedList();

        //有顺序的测试
        /*singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);*/

        //无序的进行测试
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero5);
        singleLinkedList.addByOrder(hero7);
        singleLinkedList.addByOrder(hero6);

        //遍历
        singleLinkedList.list();
        System.out.println();
        //修改节点
        HeroNode hero8 = new HeroNode(2,"小卢","玉麒麟");
        singleLinkedList.update(hero8);

        //遍历
        singleLinkedList.list();
        System.out.println();
        //删除节点
        singleLinkedList.del(4);
        singleLinkedList.list();
        System.out.println();

        int count =singleLinkedList.getLength();
        System.out.println("链表的有效个数为："+count);

        HeroNode nodeIndex = singleLinkedList.findLastIndexNode(2);
        System.out.println("倒数第2个节点为 ： "+nodeIndex);
        System.out.println();

        System.out.println("反转后的节点为");
        singleLinkedList.reverseList();
        singleLinkedList.list();
    }
}

class SingleLinkedList{
       //先初始化一个头结点
    HeroNode head = new HeroNode(0,"","");

    /**
     * 添加节点到单向链表 不考虑链表的编号顺序
     * @param heroNode
     */
    public void add(HeroNode heroNode){
        HeroNode temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=heroNode;
    }

    /**
     * 按照编号顺序进行添加操作 如果有这个编号 则添加失败
     * @param heroNode
     */
    public void addByOrder(HeroNode heroNode){
        HeroNode temp = head;
        boolean flag = false;
        while (true){
            if(temp.next==null){
                //表示在链表最后了
                break;
            }
            if(temp.next.no>heroNode.no){
                break;
            }else if(temp.next.no==heroNode.no){
                //已经存在了
                flag=true;
                break;
            }
            temp =temp.next;
        }

        if(flag){
            System.out.println("准备插入的英雄"+heroNode.no+"已经存在了");
        }else {
            //插入到链表的中 temp的后面
            heroNode.next=temp.next;
            temp.next=heroNode;
        }
    }

    /**
     * 根据newHeroNode进行修改
     * @param heroNode
     */
    public void update(HeroNode heroNode){
        //判断是否为空
        if(head.next==null){
            System.out.println("链表为空。。。。");
            return;
        }
        //定义辅助变量
        HeroNode temp = head.next;
        boolean flag = false;
        while (true){
            if(temp==null){
                break;//遍历完链表了。。。
            }
            if(temp.no==heroNode.no){
                //找到了
                flag=true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.name=heroNode.name;
            temp.nickName=heroNode.nickName;
        }else{
            System.out.println("不存在您要修改的编号！");
        }
    }

    /**
     * 删除节点
     * @param no
     */
    public void del(int no){
        HeroNode temp = head;
        boolean flag = false;
        while (true){
            if(temp.next==null){
                break; //最后了
            }
            if(temp.next.no==no){
                flag = true;
                break;//找到了删除节点
            }
            temp = temp.next;
        }

        if(flag){
             temp.next = temp.next.next;
        }else {
            System.out.println("没有找到删除的节点。。。。。。。");
        }
    }

    /**
     * 遍历链表
     */
    public void list(){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            if(temp==null){
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }

    /**
     * 新浪面试题
     * 求 单链表中有效节点的长度
     */
    public int getLength(){
        HeroNode temp = head.next;
        int sum=0;
        while (temp!=null){
            sum++;
            temp=temp.next;
        }
        return sum;
    }

    /**
     * 新浪面试题
     * 查找单链表中倒数第k个节点
     */
    public HeroNode findLastIndexNode(int index){
        HeroNode temp = head.next;
        if(temp==null){
            return null; //没有找到
        }
        int size = getLength(); //总长度

        for(int i=0;i<size-index;i++){
            temp=temp.next;
        }
        return  temp;
    }

    /**
     * 腾讯面试题
     * 反转单链表
     */
    public void reverseList(){
        //如果链表为空 或只有一个节点 不需要反转
        if(head.next==null||head.next.next==null){
            return ;
        }
        HeroNode temp = head.next;
        HeroNode next =null;
        HeroNode reverseHead = new HeroNode(0,"","");
        while (temp!=null){
            next=temp.next;
            temp.next=reverseHead;
            reverseHead=temp;
            temp=next;
        }
        head.next = reverseHead;
    }

}

//定义HeroNode 每一个HeroNode就是一个节点
class HeroNode{
     public int no;
     public String name;
     public String nickName;
     public HeroNode next; //指向下一个节点

     //构造器

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    public HeroNode() {
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}