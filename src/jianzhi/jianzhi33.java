package jianzhi;

import java.util.ArrayList;

public class jianzhi33 {
    public int getUglyNumber_Soultion(int index){
        if(index<0){
            return 0;
        }
        ArrayList<Integer>list = new ArrayList();
        list.add(1);
        int i2 = 0,i3=0,i5 =0;
        while (list.size()<index){
            //三个可能的丑数 取最小的放入数组
            int n2 = list.get(i2)*2;
            int n3 = list.get(i3)*3;
            int n5 = list.get(i5)*5;
            int min = Math.min(n2,Math.min(n3,n5));
            list.add(min);
            if(min==n2){
                n2++;
            }
            if(min==n3){
                n3++;
            }
            if(min==n5){
                n5++;
            }
        }
        return list.get(list.size()-1);
    }
}
