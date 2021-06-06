package changkao;

/**
 * @author jiaxiangyu
 * @date 2021/5/29 8:06 下午
 */
public class StringDemo {

  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = new String("hello");
    String str3 = str2; //引用富值
    System.out.println(str1 == str2); //false
    System.out.println(str1 == str3); //fasle
    System.out.println(str2 == str3); //true
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));
    System.out.println(str2.equals(str3));
  }
}
