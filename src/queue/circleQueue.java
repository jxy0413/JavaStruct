package queue;

import java.util.Scanner;

/**
 * Created by Cookie on 2019/10/14.
 */
public class circleQueue {
    public static void main(String[] args) {
         queue queue =new queue(4); //其最大的容量为3
         Scanner sc =new Scanner(System.in);
         char key =' ';//接受用户输入的
         boolean loop =true;
         while (loop){
             System.out.println("s 显示队列");
             System.out.println("e 退出程序");
             System.out.println("a 添加数据到队列");
             System.out.println("g 从队列取出程序");
             System.out.println("h 查看队列头的数据");
             key = sc.next().charAt(0);
         switch (key){
             case 's':
                 queue.showQueue();
                 break;
             case 'e':
                 sc.close();
                 loop=false;
                 break;
             case 'a':
                 System.out.println("请输入一个数");
                 int num = sc.nextInt();
                 queue.addQueue(num);
                 break;
             case 'g':
                 int queue1 = queue.getQueue();
                 System.out.println("取出来的元素为: "+queue1);
                 break;
             case 'h':
                 int headQueue = queue.headQueue();
                 System.out.println("头队列为 "+headQueue);
                 break;
             default:
                 break;
         }
         }
        System.out.println("退出程序。。。。。");
    }
}
class queue{
    private int maxSize; //表示数组最大容量
    private int front; //头指针
    private int rear;  //尾指针
    private int [] arr; //用于存放数据 模拟队列

    //初始化
    public queue(int arrMaxSize){
        maxSize=arrMaxSize;
        arr=new int[maxSize];
    }

    //判断队列是否满
    public boolean isFull(){
        return (rear+1)%maxSize==front;
    }

    //判断是否为空
    public boolean isEmpty(){
        return rear==front;
    }

    //添加数据到数列
    public void addQueue(int data){
        //判断是否满
        if(isFull()){
            System.out.println("队列已经满了 不能添加。");
            return;
        }
        arr[rear]=data;
        rear=(rear+1)%maxSize;
    }

    //出队列
    public int getQueue(){
        //判断队列是否为空
        if(isEmpty()){
            throw  new RuntimeException("队列空 不能取数据。。。。。");
        }
        int val = arr[front];
        front=(front+1)%maxSize;
        return val;
    }

    //显示队列的所有数据
    public void showQueue(){
        //遍历
        if(isEmpty()){
            System.out.println("队列空,没有数据");
            return;
        }
        for(int i=front;i<front+size();i++){
            System.out.println(arr[i]);
        }

    }

    //显示队列的投数据 取出数据
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列空 没有数据。。。");
        }
        return arr[front];
    }


    //求出当前的有效个数
    public int size(){
        return (rear-front+maxSize)%maxSize;
    }


}
