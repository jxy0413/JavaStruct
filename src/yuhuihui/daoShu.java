package yuhuihui;

import java.util.Scanner;

/**
 * Created by jxy on 2019/12/31.
 * 求一个倒数的程序
 */
public class daoShu {
    public static void main(String[] args) {
        System.out.println("请输入，输入0时表示结束");
        Scanner sc = new Scanner(System.in);
        double x;
        while (sc.hasNext()){
            x = sc.nextDouble();
            if(x==0){
                break;
            }
            int i =(int)x;
            System.out.println(i+"的倒数为"+1/x);
        }
        sc.close();
    }
}
