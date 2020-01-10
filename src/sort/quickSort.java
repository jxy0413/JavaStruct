package sort;

import java.util.Random;

/**
 * Created by Jxy on 2019/10/16.
 */
public class quickSort {
    public static void main(String[] args) {
        int[] num = {3,45,78,64,52,11,64,55,99,11,18};
        System.out.println("未排序的。。。");
        list(num);
        System.out.println();
        System.out.println("排序后的。。。");
        quickSort(num,0,num.length-1);
        list(num);

    }


    public static void quickSort(int []num,int left,int right){
        //如果left等于right 即数组中只有一个元素 直接返回
        if(left>=right){
            return;
        }
        int number = partition(num, left, right);
        quickSort(num,left,number - 1);
        quickSort(num, number + 1, right);

    }

    public static int partition(int [] num,int left,int right){
        int randNum=(int)Math.random()*(right-left+1)+left;
        //排序前先让基准值 跟随机值进行一个交换
        swap(num,left,randNum);
        int base = num[left];
        int j=left;

        for (int i = left + 1; i <= right; i++) {
            if (base>num[i]) {
                j++;
                swap(num, j, i);
            }
        }
        swap(num, left, j);
        return j;//返回一躺排序后，基准值的下角标
}

    /**
     * 交换
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    /**
     * 遍历数组
     * @param arr
     */
    public static  void list(int [] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

}
