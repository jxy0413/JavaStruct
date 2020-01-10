package sort;

import java.util.Arrays;

/**
 * Created by Cookie on 2019/10/22.
 */
public class ShellSort {
    public static void main(String[] args) {
        int [] arr = {8,9,1,7,2,3,5,4,6,0};
        shellSort(arr);
    }

    /**
     * 希尔排序 对有序序列在插入时采用交换法
     * @param arr
     */
    public static void shellSort(int [] arr){
        int temp=0;
        int count=0;

        for(int gap=arr.length/2;gap>0;gap/=2){
           for(int i=gap;i<arr.length;i++){
               for(int j=i-gap;j>=0;j-=gap){
                   if(arr[j]>arr[j+gap]){
                       temp=arr[j];
                       arr[j]=arr[j+gap];
                       arr[j+gap]=temp;
                   }
               }
           }
            count++;
            System.out.println("第"+count+"轮排序后的结果为");
            System.out.println(Arrays.toString(arr));

        }


        //希尔排序第一轮
      /*  for(int i=5;i<arr.length;i++){
            //遍历各组中的所有的元素 步长5
            for(int j=i-5;j>=0;j-=5){
                if(arr[j]>arr[j+5]){
                    temp=arr[j];
                    arr[j]=arr[j+5];
                    arr[j+5]=temp;
                }
            }
        }
        System.out.println("第一轮排序后的结果为");
        System.out.println(Arrays.toString(arr));

        //希尔排序第二轮
        for(int i=2;i<arr.length;i++){
            //遍历各组中的所有的元素 步长2
            for(int j=i-2;j>=0;j-=2){
                if(arr[j]>arr[j+2]){
                    temp=arr[j];
                    arr[j]=arr[j+2];
                    arr[j+2]=temp;
                }
            }
        }
        System.out.println("第二轮排序后的结果为");
        System.out.println(Arrays.toString(arr));

       //希尔排序第三轮
        for(int i=1;i<arr.length;i++){
            //遍历各组中的所有的元素 步长2
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("第三轮排序后的结果为");
        System.out.println(Arrays.toString(arr));*/


    }


}
