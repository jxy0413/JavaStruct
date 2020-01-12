package shuzu;

import java.util.ArrayList;

/**
 * Created by jxy on 2020/1/12.
 */
public class choushu {
    public static void main(String[] args) {
        int i = GetUglyNumber_Solution(100);
        System.out.println(i);
    }

    /**
     * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
     * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
     */
    public static int GetUglyNumber_Solution(int index){
        if(index<=0){
            return 0;
        }
        ArrayList<Integer> list = new ArrayList();
        //add进第一个丑数1
        list.add(1);
        //三个下标用来标记记录的数
        int i2 = 0,i3=0,i5=0;
        while (list.size()<index){
            //三个数可能的丑数，取最小的丑数放在数组里面
            int n2 = list.get(i2)*2;
            int n3 = list.get(i3)*3;
            int n5 = list.get(i5)*5;

            int min=Math.min(n2,Math.min(n3,n5));
            list.add(min);

            if(min==n2){
                i2++;
            }
            if(min==n3){
                i3++;
            }
            if(min==n5){
                i5++;
            }
        }
        return list.get(list.size()-1);
    }
}
