package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/7/3 7:47 下午
 *将一个字符串反转，如输入abcdef，反转后的输出为 fedcba（初试1）
 */
public class jianzhiTest {

  public static void main(String[] args) {
      String str = "meituan";
      System.out.println(reverse(str));
  }

  public static String reverse(String str){
    StringBuilder sb = new StringBuilder();
    char[] chars = str.toCharArray();
    for(int i=chars.length-1; i>=0;i--){
      sb.append(chars[i]);
    }
    return sb.toString();
  }
}
