package LinkedList;

/**
 * Created by Cookie on 2019/10/15.
 */
public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        System.out.println("双向链表的测试。。。。。");
        //先创建节点
        doubleHero hero1 =new doubleHero(1,"宋江","及时雨");
        doubleHero hero2 =new doubleHero(2,"卢俊义","玉麒麟");
        doubleHero hero3 =new doubleHero(3,"林冲","豹子头");
        doubleHero hero4 =new doubleHero(4,"吴用","智多星");

        //创建双向链表
        doubleLinkedList doubleLinkedList =new doubleLinkedList();
        doubleLinkedList.add(hero1);
        doubleLinkedList.add(hero2);
        doubleLinkedList.add(hero3);
        doubleLinkedList.add(hero4);

        doubleLinkedList.list();

        //修改双向链表
        System.out.println("修改后的双向链表。。。。。");
        doubleHero hero5 =new doubleHero(2,"贾相宇","君临天下");
        doubleLinkedList.update(hero5);
        doubleLinkedList.list();

        //删除双向链表节点
        System.out.println();
        doubleLinkedList.del(2);
        doubleLinkedList.list();

    }
}

class doubleLinkedList{
    //先初始化头结点 不存放任何数据
    private  doubleHero head =new doubleHero(0,"","");

    //返回头结点
    public doubleHero getHead(){
        return head;
    }

    /**
     * 双向链表的遍历
     */
    public void list(){
        //判断连表是否为空
        if(head.next==null){
            System.out.println("链表为空。。。。");
            return;
        }
        doubleHero temp =head.next;
        while (temp!=null){
            System.out.println(temp);
            temp=temp.next;
        }
    }

    /**
     * 直接将链表插入到最后
     * @param heroNode
     */
    public void add(doubleHero heroNode){
        doubleHero temp =head;
        while (temp.next!=null){
            temp=temp.next;
        }
        //直接插入到最后
        temp.next=heroNode;
        heroNode.pre=temp;
    }

    /**
     * 修改双向节点
     * @param newHeroNode
     */
    public void update(doubleHero newHeroNode){
         //判断是否为空
        if(head.next==null){
            System.out.println("链表为空。。。");
            return;
        }
        //需要定义一个辅助节点
        doubleHero temp = head.next;
        boolean falg=false;
        while (temp!=null){
            if(temp.no==newHeroNode.no){
                falg=true;
                break;
            }
            temp=temp.next;
        }
        if(falg){
            temp.name=newHeroNode.name;
            temp.nickName=newHeroNode.nickName;
        }else{
            System.out.println("没有找到编号为"+newHeroNode.no+"的节点");
        }
    }

    public void del(int no){
        doubleHero temp = head.next;
        if(temp==null){
            System.out.println("链表为空 无法删除");
            return;
        }
        boolean falg=false;
        while (temp!=null){
            if(temp.no==no){
                falg=true;
                break;
            }
            temp=temp.next;
        }
        if(falg){
            temp.pre.next=temp.next;
            //如果是最后一个节点 就不要执行这句话
            if(temp.next!=null){
                temp.next.pre=temp.pre;
            }
        }else{
            System.out.println("要删除的节点"+no+"不存在");
        }
    }


}

class doubleHero{
    public int no;
    public String name;
    public String nickName;
    public doubleHero next;//指向下一个节点 默认为null
    public doubleHero pre; //指向上一个节点 默认为null

    //初始化
    public doubleHero(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "DoubleLinkedList{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}