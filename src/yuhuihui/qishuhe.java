package yuhuihui;

import java.util.Scanner;

/**
 * Created by jxy on 2019/12/31.
 * 求解奇数数列前N项累加和的Java程序（提示：for语句）
 */
public class qishuhe {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入所求奇数,输入为0时结束");
        while (sc.hasNext()){
            n = sc.nextInt();
            if(n==0){
                break;
            }
            if(n%2==0){
                System.out.println("请输入奇数");
                continue;
            }
            int sum = 0;
            for(int i=1;i<=n;i+=2){
                sum+=i;
            }
            System.out.println("前n项累加和为 "+sum);
        }
        sc.close();
    }
}
