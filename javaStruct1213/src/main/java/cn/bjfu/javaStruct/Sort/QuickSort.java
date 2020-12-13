package cn.bjfu.javaStruct.Sort;

/**
 * Created by jxy on 2020/12/13 0013 10:15
 */
//12-13 快速排序
public class QuickSort {
    public static void sort(int [] array,int left,int right){
        if(left>=right){
            return;
        }
        //base存在基数
        int base = array[left];
        int i = left;int j = right;
        while (i!=j){
            //从右面往左面数，直到找到比base小的
            while (array[j]>=base&&i<j){
                j--;
            }
            while (array[i]<=base&&i<j){
                i++;
            }
            if(i<j){
                int temp  = array[i];
                array[i] =  array[j];
                array[j] = temp;
            }
        }
        //将基准为放到中间
        array[left] = array[i];
        array[i] = base;
        //继续递归
        sort(array,left,i-1);
        sort(array,i+1,right);
    }

    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7,2};
        sort(arr,0,arr.length-1);
    }
}
