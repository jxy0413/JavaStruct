package changkao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/10/9 7:49 下午
 */
public class Main9 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int d = sc.nextInt();

    //for
    int [] tow = new int[n];
    for(int i=0;i<n;i++){
      int num = sc.nextInt();
      tow[i] = num;
    }

    int [] three = new int[n];
    for(int i=0;i<n;i++){
      int num = sc.nextInt();
      three[i] = num;
    }

    int [] four = new int[n];
    for(int i=0;i<n;i++){
      int num = sc.nextInt();
      four[i] = num;
    }

    //排序
    int [] five = new int[n];
    for(int i=0;i<n;i++){
      five[i] = tow[i];
    }

    Arrays.sort(five);

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){

      }
    }



    List<Map> list = new ArrayList();
    for(int i=1;i<=n;i++){
       Map<Integer, Integer> map = new HashMap<>();
       map.put(i, tow[i-1]);
       list.add(map);
    }
    int max = -100000;
    for(int i=1;i<=list.size();i++){
      Map map = list.get(i);
      Integer num = (Integer)map.get(i);
      if(three[i-1] < k && four[i-1] < d/n * num){
         if(max < num){
           max = num;
         }
      }
    }
    if(max==-100000){
      System.out.println(-1);
    }else{
      System.out.println(max);
    }
  }
}
