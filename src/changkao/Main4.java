package changkao;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author jiaxiangyu
 * @date 2021/9/3 6:43 下午
 */
public class Main4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    for (int i = 0; i < T; i++) {
      Stack<Character> stack = new Stack<>();
      int L = scanner.nextInt();
      String D = scanner.next();
      int result = 0;
      for (int k = 0; k < D.length(); k++) {
        char c = D.charAt(k);
        if (stack.isEmpty()) {
          if (c == ')') {
            result++;
          } else {
            stack.push(c);
          }
        } else {
          if (c == ')') {
            stack.pop();
          } else {
            stack.push(c);
          }
        }
      }
      System.out.println(result);
    }
  }
}
