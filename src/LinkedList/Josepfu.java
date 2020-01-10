package LinkedList;

/**
 * Created by Cookie on 2019/10/16.
 */
public class Josepfu {
    public static void main(String[] args) {
        CircleSingleLinkedList cir =new CircleSingleLinkedList();
        cir.addBoy(250);
        //cir.showBoy();
        cir.countBoy(1,2,250);
    }
}

class CircleSingleLinkedList{
    //创建一个first节点 当前没有编号
    private Boy first = null;

    /**
     * 创建一个环形的单向链表
     * @param nums
     */
    public void addBoy(int nums){
        if(nums<1){
            System.out.println("nums的值输入不正确");
            return;
        }
        Boy curBoy =null; //辅助指针 帮助
        for(int i=1;i<=nums;i++){
            //根据编号 创建小孩节点
            Boy boy =new Boy(i);
            if(i==1){
                first=boy;
                curBoy=first; //指向第一个
            }else{
                curBoy.next=boy;
                boy.next=first;
                curBoy=boy;
            }
        }
    }

    /**
     * 遍历boy
     */
    public void showBoy(){
        //判断连表是否为空
        if(first==null){
            System.out.println("链表中没有任何小孩 链表为空");
            return;
        }
        Boy curBoy = first;
        while (true){
            System.out.println(curBoy);
            if(curBoy.next==first){
                break;
            }
            curBoy = curBoy.next;
        }
    }

    /**
     *
     * @param startNo 表示从第几个小孩开始数数
     * @param countNum 表示数几下
     * @param nums  表示最初有多少个小孩在圈中
     */
    public void countBoy(int startNo,int countNum,int nums){
        //先对数据进行校验
        if(first==null||startNo<1||startNo>nums){
            System.out.println("数据参数输入有误,请重新输入");
            return;
        }

        //创建要给辅助的指针 帮助小孩完成出圈
        Boy helper = first;
        while (true){
            if(helper.next==first){
                break;
            }
            helper=helper.next;
        }

        //小孩报数前 先让first 和helper移动k-1次
        for(int j=0;j<startNo-1;j++){
             first = first.next;
             helper=helper.next;
        }

        //小孩开始报数
        while (true){
            if(helper==first){
                break;//说明圈中只有一个节点
            }

            for(int j=0;j<countNum-1;j++){
                first = first.next;
                helper=helper.next;
            }
            //这个时候first指向的指针就是要出的节点
            System.out.println("小孩"+first.no+"出圈");
            //这时first指向小孩的节点出圈
            first=first.next;
            helper.next=first;
        }
        System.out.println("最后留在圈内的小孩节点为"+first.no);
    }
}

class Boy{
    public int no;//编号
    public Boy next;//指向下一个孩子

    public Boy(int no) {
        this.no = no;
    }

    public Boy() {
    }

    @Override
    public String toString() {
        return "Boy{" +
                "no=" + no +
                '}';
    }
}