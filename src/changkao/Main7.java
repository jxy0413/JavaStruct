package changkao;

import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2021/9/7 7:36 下午
 */
public class Main7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int ans = 0, x;
    for(int i = 0; i < n; i++){
      String next = sc.next();
      Long num = Long.parseLong(next);
      boolean xunhuan = true;
      while (xunhuan){
        boolean flag = true;
        String s = String.valueOf(num);
        char[] chars1 = s.toCharArray();
        boolean k = false;
        for(char c :chars1){
          if(c > '3' || c < '1'){
            flag = false;
          }
          if(c == '0'){
            k = true;
            break;
          }
        }

//        if(k){
//          String s1 = num.toString();
//          s1.replace()
//        }


        if(k){
          num--;
        }

        if(flag){
          xunhuan = false;
          System.out.println(s);
          break;
        }else{
           StringBuilder sb = new StringBuilder();
           String s1 = num.toString();
           char[] chars = s1.toCharArray();
           for(char c : chars){
             if(c > '3'){
               c = '3';
               sb.append(c);
             }else{
               sb.append(c);
             }
           }
           num = Long.parseLong(sb.toString());
        }
      }
    }
  }
}
