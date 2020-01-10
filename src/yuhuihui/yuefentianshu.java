package yuhuihui;

import java.util.Scanner;

/**
 * Created by jxy on 2019/12/31.
 */
public class yuefentianshu {
    public static void main(String[] args) {
        System.out.println("请输入正确月份(1-12),输入为0时退出");
        boolean falg = true;
        Scanner sc = new Scanner(System.in);
        int i;
        while (sc.hasNext()&&falg){
            i=sc.nextInt();
            switch (i){
                case 0:
                    falg=false;
                    continue;
                case 1:
                    System.out.println(31);
                    continue;
                case 2:
                    System.out.println(29);
                    continue;
                case 3:
                    System.out.println(31);
                    continue;
                case 4:
                    System.out.println(30);
                    continue;
                case 5:
                    System.out.println(31);
                    continue;
                case 6 :
                    System.out.println(30);
                    continue;
                case 7 :
                    System.out.println(31);
                    continue;
                case 8 :
                    System.out.println(31);
                    break;
                case 9 :
                    System.out.println(30);
                    continue;
                case 10 :
                    System.out.println(31);
                    continue;
                case 11 :
                    System.out.println(30);
                    continue;
                case 12 :
                    System.out.println(31);
                    continue;
                default:
                    System.out.println("请重新输入");
                    continue;
            }
        }
        sc.close();
    }
}
