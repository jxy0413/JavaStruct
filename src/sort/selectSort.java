package sort;

import java.util.Arrays;

/**
 * Created by Cookie on 2019/10/22.
 */
public class selectSort {
    public static void main(String[] args) {
        int arr[] = {101,34,119,1};
        selectSort(arr);
    }

    //选择排序
    public static void selectSort(int []arr){
        //推导过程中 可以用for来解决
        //先来第一轮
        /*int minIndex = 0;
        int min = arr[0];
        for(int j=0+1;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
                minIndex=j;
            }
        }
        //将最小值 放在arr[0] 即可交换
        if(minIndex!=0){
            arr[minIndex]=arr[0];
            arr[0]=min;
        }

        System.out.println("第一轮后。。。");
        System.out.println(Arrays.toString(arr));


        //第二轮
        minIndex = 1;
        min = arr[1];
        for(int j=1+1;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
                minIndex=j;
            }
        }
        //将最小值 放在arr[0] 即可交换
        if(minIndex!=1){
            arr[minIndex]=arr[1];
            arr[1]=min;
        }

        System.out.println("第二轮后。。。");
        System.out.println(Arrays.toString(arr));

        //第三轮
        minIndex = 2;
        min = arr[2];
        for(int j=2+1;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
                minIndex=j;
            }
        }
        //将最小值 放在arr[0] 即可交换
        if(minIndex!=2){
            arr[minIndex]=arr[2];
            arr[2]=min;
        }

        System.out.println("第三轮后。。。");
        System.out.println(Arrays.toString(arr));*/

        //推导出总的
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            int min =arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }

            System.out.println("第"+i+"轮后。。。");
            System.out.println(Arrays.toString(arr));
        }
    }
}
