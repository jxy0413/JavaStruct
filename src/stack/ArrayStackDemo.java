package stack;


import java.util.Scanner;

/**
 * Created by Cookie on 2019/10/16.
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        String key="";
        while (loop){
            System.out.println("show 表示显示栈");
            System.out.println("exit 退出程序");
            System.out.println("push 添加数据到入栈");
            System.out.println("pop 表示从栈中取出数据");
            System.out.println("请输入你的选择");
            key=sc.next();
            switch (key){
                case "show":
                    stack.listStack();
                    break;
                case "exit":
                    sc.close();
                    loop=false;
                    break;
                case "push":
                    System.out.println("请输入一个数");
                    int num = sc.nextInt();
                    stack.push(num);
                    break;
                case "pop":
                    try {
                        int res = stack.pop();
                        System.out.println("出站的数据为"+res);
                        break;
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
               default:
                   break;
            }
        }
        System.out.println("程序退出。。。。。。");
    }
}
class ArrayStack{
     private int maxSize;//栈的大小
     private int [] stack; //数组 数组模拟栈 数据放在该数组
     private int top = -1; //top表示栈顶 初始化为-1

     //构造器
    public ArrayStack(int maxSize){
        this.maxSize=maxSize;
        stack=new int[maxSize];
    }

    /**
     * 栈满
     * @return
     */
    public boolean isFull(){
        return top==maxSize-1;
    }

    /**
     * 栈空
     * @return
     */
    public boolean ifEmpty(){
        return top==-1;
    }

    /**
     * 入栈
     * @param value
     */
    public void push(int value){
        if(isFull()){
            System.out.println("栈已经满了。。。。");
            return;
        }
        top++;
        stack[top]=value;
    }

    /**
     * 出栈pop 将栈顶元素的数据返回
     * @return
     */
    public int pop(){
        //先判断是否为空
        if(ifEmpty()){
            throw  new RuntimeException("栈空 没有数据。。。。");
        }
        int value = stack[top];
        top--;
        return value;
    }

    /**
     * 遍历栈
     */
    public void listStack(){
        if(ifEmpty()){
            System.out.println("栈空没有数据。。。");
            return;
        }
        //需要从栈顶开始显示数据
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }


}