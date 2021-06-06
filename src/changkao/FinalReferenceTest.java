package changkao;

/**
 * @author jiaxiangyu
 * @date 2021/5/29 8:18 下午
 */
public class FinalReferenceTest {

  public static void main(String[] args) {
    final int [] iArr = {1,2,3,4};
    iArr[2] = 4;
    for(int str : iArr){
      System.out.println(str);
    }
  }
}
