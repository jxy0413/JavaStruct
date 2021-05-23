package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/5/19 10:09 下午
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class jianzhi2 {
  public static String replaceSpace (String s) {
     StringBuffer sb = new StringBuffer();
     for(int i=0; i<s.length() ;i++){
         char c = s.charAt(i);
         if(" ".equalsIgnoreCase(String.valueOf(c))){
             sb.append("%20");
         }else{
           sb.append(c);
         }
     }
     return sb.toString();
  }

  public static void main(String[] args) {
    String str = "We Are Happy";
    System.out.println(replaceSpace(str));
  }
}
