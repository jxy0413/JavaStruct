package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/8/15 3:54 下午
 */
public class jianzhiTengxun1 {

  public static void main(String[] args) {
      String str = "Tencent";
      System.out.println(getMin(str));
  }

  /**
   * 一个字符串，里面包含大写和小写字母，如何将这个字符串全转成大写或者小写的。
   * @param str
   * @return
   */
    public static String getMin(String str){
      StringBuilder sb = new StringBuilder();
      if(str != null){
        for(int i=0; i<str.length(); i++){
          char c = str.charAt(i);
          if(Character.isUpperCase(c)){
            sb.append(Character.toLowerCase(c));
          }else{
            sb.append(c);
          }
        }
      }
      return sb.toString();
    }
}
