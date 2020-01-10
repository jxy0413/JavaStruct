package stack;

/**
 * Created by Cookie on 2019/10/17.
 * 实现中缀表达式的计算
 */
public class Calculator {
    public static void main(String[] args) {
        String experssion = "1+1*6-8+9*30+2";
        //创建两个栈
        //1.数字栈
        ArrayStack2 numStack = new ArrayStack2(10);
        //2.符号栈
        ArrayStack2 operStack = new ArrayStack2(10);

        char ch;//每次得到char保存到ch
        int index=0;//用于扫描
        int num1;
        int num2;
        int oper=0;
        int res;
        String keepNum="";
        //开始扫描experssion
        while (true){
            //依次得到每一个字符
            ch=experssion.substring(index,index+1).charAt(0);
           // System.out.println(ch);
            //判断ch是什么 要做相应的处理
            if(operStack.isOper(ch)){
                //判断当前的符号栈是否为空
                if(!operStack.ifEmpty()){
                      if(operStack.priority(ch)<=operStack.priority(operStack.peek())){
                          num1=numStack.pop();
                          num2=numStack.pop();
                          oper=operStack.pop();
                          res=numStack.cal(num1,num2,oper);
                          //把运算的结果压入数栈
                          numStack.push(res);
                          //然后将当前的操作符入符号栈
                          operStack.push(ch);
                      }else{
                          //如果当前操作符优先级大于栈中操作符
                          operStack.push(ch);
                      }

                }else {
                    //符号栈为空 直接入符号栈
                    operStack.push(ch);
                }
            }else {
                //numStack.push(ch-48);
                //处理多位数
                keepNum+=ch;
                if(index==experssion.length()-1){
                    numStack.push(Integer.parseInt(keepNum));
                }else{
                    //要判断下一位是不是数字 是数字则继续扫描 不是的话 如果是符号栈 则入栈
                    if(operStack.isOper(experssion.substring(index+1,index+2).charAt(0))){
                        numStack.push(Integer.parseInt(keepNum));
                        //同时keepNum清空
                        keepNum="";
                    }

                }

            }
            index++;
            if(index>=experssion.length()){
                break;
            }
        }

        //当扫描完毕后 就从顺序栈和符号中pop出相应的数和符号
        while (true){
            if(operStack.ifEmpty()){
                break;
            }
            num1=numStack.pop();
            num2=numStack.pop();
            oper=operStack.pop();
            res=numStack.cal(num1,num2,oper);
            numStack.push(res);
        }
        //将数栈中的值pop出 就是结果
        int res2=numStack.pop();
        System.out.println("表达式的结果为："+res2);

    }
}
class ArrayStack2{
    private int maxSize;//栈的大小
    private int [] stack; //数组 数组模拟栈 数据放在该数组
    private int top = -1; //top表示栈顶 初始化为-1

    //构造器
    public ArrayStack2(int maxSize){
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

    public int peek(){
        return stack[top];
    }

    //数字越大 则优先级越高
    public int priority(int oper){
        if(oper=='*'||oper=='/'){
            return 1;
        }else  if(oper=='-'||oper=='+'){
            return 0;
        }else {
            return -1;
        }
    }

    //判断是不是一个运算符
    public boolean isOper(char val){
        return val=='+'||val=='-'||val=='*'||val=='/';
    }

    //计算方法
    public int cal(int num1,int num2,int oper){
        int res=0; //用于存放结果
        switch (oper){
            case '+':
                res=num1+num2;
                break;
            case '-':
                res=num2-num1;
                break;
            case '*':
                res=num1*num2;
                break;
            case '/':
                res=num1/num2;
                break;
            default:
                break;
        }
        return res;
    }

}