package jianzhioffermeituan;

import java.util.ArrayList;

/**
 * @author jiaxiangyu
 * @date 2021/7/17 10:14 下午
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class jianzhi32 {
  public int GetUglyNumber_Solution(int index) {
        if(index == 0){
          return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        list.add(1);
        while (list.size() < index){
          int n2 = list.get(i2) * 2;
          int n3 = list.get(i3) * 3;
          int n5 = list.get(i5) * 5;
          int min = Math.min(n2, Math.min(n3, n5));
          list.add(min);
          if(min == n2){
            i2++;
          }
          if(min == n3){
            n3++;
          }
          if(min == n5){
            n5++;
          }
        }
        return list.get(list.size()-1);
  }

}
