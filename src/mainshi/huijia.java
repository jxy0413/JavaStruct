package mainshi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jxy on 2020/1/5.
 */
public class huijia {
    public static void main(String[] args) throws Exception{
       //测试
        System.out.println(baifang());

    }
    
    public static  int baifang() throws Exception{
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //创建数组
        int [] stu = new int[number];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        for(int i=0;i<number;i++){
             int k = Integer.parseInt(split[i]);
             stu[i]=k;
        }

        //对数组进行排序
        Arrays.sort(stu);
        int temp = stu[stu.length/2];
        int sum = 0 ;
        for(int i=0;i<number;i++){
           sum+= Math.abs(stu[i]-temp);
        }
        return sum;
    }
}
