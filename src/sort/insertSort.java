package sort;

import java.util.Arrays;

/**
 * Created by Cookie on 2019/10/22.
 */
public class insertSort {
    public static void main(String[] args) {
        int arr [] ={101,34,119,1,-4,89};
        insertSort(arr);
    }


    //插入排序
    public static void insertSort(int []arr){
          //先推导
         int insertVal = 0;
         int insertIndex=0;

         for(int i=1;i<arr.length;i++){
             //定义待插入的数
             insertIndex=i-1;
             insertVal=arr[i];

             while (insertIndex>=0&&insertVal<arr[insertIndex]){
                 arr[insertIndex+1]=arr[insertIndex];
                 insertIndex--;
             }

             arr[insertIndex+1]=insertVal;

             System.out.println("第"+i+"轮插入");
             System.out.println(Arrays.toString(arr));

         }


         //第一轮 {101,34,119,1} ==》{34.101，119，1}
        //定义待插入的数
      /*  int insertVal=arr[1];
        int insertIndex=1-1;  //即arr[1] 的前面的那个下标

        //给insertVal找到插入位置
        while (insertIndex>=0&&insertVal<arr[insertIndex]){
            arr[insertIndex+1]=arr[insertIndex];
            insertIndex--;
        }

        //当退出循环后
        arr[insertIndex+1]=insertVal;
        System.out.println("第一轮插入");
        System.out.println(Arrays.toString(arr));


        insertVal=arr[2];
        insertIndex=2-1;     //即arr[2] 的前面的那个下标

        //给insertVal找到插入位置
        while (insertIndex>=0&&insertVal<arr[insertIndex]){
            arr[insertIndex+1]=arr[insertIndex];
            insertIndex--;
        }

        //当退出循环后
        arr[insertIndex+1]=insertVal;
        System.out.println("第二轮插入");
        System.out.println(Arrays.toString(arr));


        insertVal=arr[3];
        insertIndex=3-1;     //即arr[2] 的前面的那个下标

        //给insertVal找到插入位置
        while (insertIndex>=0&&insertVal<arr[insertIndex]){
            arr[insertIndex+1]=arr[insertIndex];
            insertIndex--;
        }

        //当退出循环后
        arr[insertIndex+1]=insertVal;
        System.out.println("第三轮插入");
        System.out.println(Arrays.toString(arr));*/
    }
}
