package sort;

/**
 * Created by jxy on 2020/1/3.
 */
public class guibingsuanfa {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 41, 7, 11, 13, 17, 59, 19, 23, 29, 31, 37, 43, 47, 53};
        int[] hillSortArrays = mergeSort(array);

        for (int s : hillSortArrays) {
            System.out.print(s + " ");
        }
    }

    private static int[] mergeSort(int[] arrays) {
        return sort(arrays, 0, arrays.length - 1);
    }

    //排序
    public static int[] sort(int [] data,int left,int right){
        if(left>=right){
            return data;
        }
        //找出中间索引
        int center = (left+right)/2;
        //对左边数组进行递归
        sort(data,left,center);
        //对右面数组进行递归
        sort(data,center+1,right);

        return merge(data,left,center,right);
    }

    public static int [] merge(int []data,int left,int center,int right){
        //临时数组
        int [] tmpArr = new int[data.length];
        //右数组索引
        int mid =center+1;
        //third记录临时数组索引
        int third = left;
        //缓存左数组第一个元素的索引
        int tmp = left;

        while(left<=center&&mid<=right){
            if(data[left] <= data[mid]){
                tmpArr[third++] = data[left++];
            }else{
                tmpArr[third++] = data[mid++];
            }
        }

        while(mid<=right){
            tmpArr[third++] = data[mid++];
        }

        while (left <= center){
            tmpArr[third++] = data[left++];
        }

        while (tmp<= right){
            data[tmp] = tmpArr[tmp++];
        }

        return  data;
    }
}
