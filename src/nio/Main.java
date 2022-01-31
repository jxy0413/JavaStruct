package nio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author jiaxiangyu
 * @date 2021/9/11 2:23 下午
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    System.out.println(getString(n));
  }

  public static int getString(String str){
    int maxLen = 0 ;
    for(int i=0;i< str.length();i++){
      Set<Character> set = new HashSet();
      for(int j=i;j<str.length();j++){
        if(set.contains(str.charAt(j))){
          break;
        }
        set.add(str.charAt(j));
      }
      maxLen = Math.max(maxLen, set.size());
    }
    return maxLen;
  }
}
