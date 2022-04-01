package changkao;

import java.util.Scanner;

/**
 * @author jiaxiangyu
 * @date 2022/3/15 7:14 下午
 */
public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int value = sc.nextInt();
        char [] [] c = new char[key][value];
        for(int i = 0; i < key; i++){
            String str = sc.next();
            for(int j = 0; j < value; j++){
                char c1 = str.charAt(j);
                c[i][j] = c1;
            }
        }

        int key1 = sc.nextInt();
        int value1 = sc.nextInt();
        char [] [] c1 = new char[key1][value1];
        for(int i = 0; i < key1; i++){
            String str = sc.next();
            for(int j = 0; j < value1; j++){
                char c2 = str.charAt(j);
                c1[i][j] = c2;
            }
        }

        int res = 0;


    }
}
