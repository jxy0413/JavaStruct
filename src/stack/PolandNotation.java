package stack;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import sun.dc.pr.PRError;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Cookie on 2019/10/18.
 * 逆波兰表达式
 */
public class PolandNotation {
    public static void main(String[] args) {

        //完成将一个中缀表达式转成后缀表达式的功能
        //1+((2+3)*4)-5 转成1 2 3 + 4 * + 5
        String expression = "1+((2+3)*4)-5";
        List<String> strings = toInfixExpressionList(expression);
        System.out.println(strings);
        List<String> strings1 = parseSuffixExpressionList(strings);
        System.out.println();
        System.out.println(strings1);


        //先定义给逆波兰表达式
        String suffixExperssion ="4 5 * 8 - 60 + 8 2 / +"; //76
        List<String> listString = getListString(suffixExperssion);
        int calculate = calculate(listString);
        //System.out.println(calculate);

    }

    /**
     * 将中缀表达式转成List
     * @param s
     * @return
     */
    public static List<String> toInfixExpressionList(String s){
        //定义一个List 存放中缀表达式对应的内容
        List<String> ls =new ArrayList<String>();
        int i=0; //这是一个指针 用于遍历
        String str;//多位数的拼接
        char c; //每遍历一个字符 就可以存放到c
        do{
            //如果是非数字 直接加入到ls
            if((c=s.charAt(i))<48||(c=s.charAt(i))>54){
                ls.add(""+c);
                i++;
            }else{
              //如果是一个数
                str="";
                while (i<s.length()&&(c=s.charAt(i))>=48&&(c=s.charAt(i))<=57){
                    str += c; //拼接
                    i++;
                }
               ls.add(str);
            }
        }while (i<s.length());
        return ls;
    }

    /**
     * 将中缀表达式转成后缀表达式
     * @param ls
     * @return
     */
    public static List<String> parseSuffixExpressionList(List<String>ls){
          //定义两个栈
        Stack<String> s1 =new Stack<>();
        //定义第二个栈 由于没有pop操作 所有直接用List即可
        List<String>s2 = new ArrayList<>();

        //遍历
        for(String item:ls){
            //如果是一个数 直接压入到s2
            if(item.matches("\\d+")){
                s2.add(item);
            }else if(item.equals("(")){
                s1.push(item);
            }else if(item.equals(")")){
                //如果是右括号 ")"
                while (!s1.peek().equals("(")){
                    s2.add(s1.pop());
                }
                s1.pop(); //将(弹出s1栈
            }else {
               //当item优先级小于等于是s1栈顶运算符，将s1栈顶运算符弹出并加入到s1中 再次转到与s1中的
                //新的栈顶元素运算符相比较
                while (s1.size()!=0&&Operation.getValue(s1.peek())>=Operation.getValue(item)){
                    s2.add(s1.pop());
                }
                //同时将item压入栈
                s1.push(item);
            }
        }

        //将s1中剩余的运算符Push到s2中
        while (s1.size()!=0){
            s2.add(s1.pop());
        }

        return s2;
    }

    /**
     * 将一个逆波兰表达式 依次将数据和运算符 放入到ArrayList里面
     * @param suffixExpression
     * @return
     */
    public static List<String> getListString(String suffixExpression){
        //将suffixExperssion分割
        String[] split = suffixExpression.split(" ");
        List<String> list = new ArrayList<>();
        for(String ele:split){
            list.add(ele);
        }
        return list;
    }

    /**
     * 完成对逆波兰表达式的运算
     * @param ls
     * @return
     */
    public static int calculate(List<String> ls){
          //创建栈
        Stack<String> stack =new Stack<String>();
        //遍历ls
        for(String item:ls){
            //这里使用正则表达式取出数
            if(item.matches("\\d+")){
                //入栈
                stack.push(item);
            }else {
                //pop出两个数 并运算
                int num2=Integer.parseInt(stack.pop());
                int num1=Integer.parseInt(stack.pop());
                int res;
                if(item.equals("+")){
                    res=num1+num2;
                }else if(item.equals("-")){
                    res=num1-num2;
                }else if(item.equals("/")){
                    res=num1/num2;
                }else if(item.equals("*")){
                    res=num1*num2;
                }else {
                    throw new RuntimeException("输入的不合法");
                }
                stack.push(""+res);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}

//编写一个类 Operation 可以返回一个运算符 对应的优先级
class Operation{
    private static int ADD=1;
    private static int SUB=1;
    private static int MUL=2;
    private static int DIV=2;

    //写一个方法 返回对应的优先级
    public static int getValue(String operation){
      int res=0;
      switch (operation){
          case "+":
              res=ADD;
              break;
          case "-":
              res=SUB;
              break;
          case "*":
              res=MUL;
              break;
          case "/":
              res=DIV;
              break;
          default:
              //System.out.println("不存在该运算符");
              break;
      }
        return res;
    }
}