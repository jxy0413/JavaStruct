package changkao;

import java.util.Random;

/**
 * @author jiaxiangyu
 * @date 2021/5/29 8:28 下午
 */
public class StringBuilderAndBuffer {

  public static void main(String[] args) {
    String();
  }

  public static void StringBuilder(){
    long start = System.currentTimeMillis();
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<100000;i++){
      Random random = new Random(10);
      sb.append(random.nextInt());
    }
    long end = System.currentTimeMillis();
    System.out.println("花费时间为 "+ (end-start)+ "毫秒");
  }

  public static void StringBuffer(){
    long start = System.currentTimeMillis();
    StringBuffer sb = new StringBuffer();
    for(int i=0; i<100000;i++){
      Random random = new Random(10);
      sb.append(random.nextInt());
    }
    long end = System.currentTimeMillis();
    System.out.println("花费时间为 "+ (end-start)+ "毫秒");
  }

  public static void String(){
    long start = System.currentTimeMillis();
    String sb = new String();
    for(int i=0; i<1000;i++){
      Random random = new Random(10);
      sb += random.nextInt();
    }
    long end = System.currentTimeMillis();
    System.out.println("花费时间为 "+ (end-start)+ "毫秒");
  }
}
