package jianzhioffermeituan;

import java.util.Stack;

/**
 * @author jiaxiangyu
 * @date 2021/7/26 9:13 下午
 */
public class Testjia {

  public static void main(String[] args) {
      String str = "(())()";
      System.out.println(getLength(str));
  }

  public static int getLength(String str){
    Stack<Character> stack = new Stack();
    Integer max = -1;
    int length = 0;
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      System.out.println(c);
      if(c=='('){
        System.out.println("jia");
        stack.push(c);
      }
      if(c==')' && stack.isEmpty()){
        length = 0;
      }

      if(c==')' && !stack.isEmpty()){
        stack.pop();
        length = length+2;
      }
      if(max<length){
        max = length;
      }
    }
    return max;
  }
}
