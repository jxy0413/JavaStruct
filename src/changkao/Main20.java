package changkao;

import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2022/3/15 7:03 下午
 * 输入为2行，第一行是一个整数m，代表第二行数组的长度。第二行是一个整数数组，
 * 数组里的第1个数代表第一个计时点（初始计时点）的编号，
 * 第2-3个数代表第一个计时点对应的两条向前的岔路尽头的计时点编号，然后是第3-7个数，第8-15个数，以此类推(可以看输入样例和提示中图例)。
 * 所有的计时点编号都是正的，且编号均小于10^6，-1表示某条岔路不存在。
 *
 * 第一行输入数字m保证等于2^n - 1（0 <= n <= 16）。
 */
public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        if(num == 1){
            System.out.println(res++);
        }else{
            for(int i = 0; i < num; i++){
                Integer key = sc.nextInt();
                if(i > num / 2 && key != -1 ){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
