package sort;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Cookie on 2019/10/22.
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
       // int arr[] ={3,-9,-1,10,-5};

        int arr [] = new int[80000];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*80000); //生成一个 0-8000000
        }

        Date data1 = new Date();
        long time1 = data1.getTime();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是 "+date1Str);
        int temp = 0;
        boolean falg = false; //表示是否交换过
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    falg = true;
                }
            }
            //System.out.println("第"+(i+1)+"趟排序的数组");
            if(!falg){ //一次都没交换 直接退出
               break;
            }else {
               falg=false; //重置flag 下次判断
            }
            //System.out.println(Arrays.toString(arr));
        }
        Date data2 = new Date();
        long time2 = data2.getTime();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序后的时间为 "+date2Str);

        long time = time2-time1;
        System.out.println("时间戳为 "+time);
    }
}
