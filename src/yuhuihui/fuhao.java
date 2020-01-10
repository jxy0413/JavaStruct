package yuhuihui;

import java.util.Scanner;

/**
 * Created by jxy on 2019/12/31.
 */
public class fuhao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入数字： ");
            int num = sc.nextInt();
            if (num > 0) {
                System.out.println("num is " + 1);
            } else if (num == 0) {
                System.out.println("num is " + 0);
            } else {
                System.out.println("num is " + -1);
            }
        }
        sc.close();
    }
}
