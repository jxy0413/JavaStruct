package changkao;

/**
 * @author jiaxiangyu
 * @date 2021/5/29 8:20 下午
 */
public class TestFinal {

  public static void main(String[] args) {
     TestFinal testFinal = new TestFinal();
     testFinal.test(1);
  }

  public void test(int b){
    final int a = 10;
    int c = 10;
    new Thread(){
        public void run(){
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);
        }
    }.start();
  }
}
class outClass{
  private static int age = 10;
  public static void outPrint(int x){
      class Inclass{
             public void InPrint(){
               System.out.println(age);
               System.out.println(x);
             }
      }
      new Inclass().InPrint();
  }

  public static void main(String[] args) {

  }
}