package search;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cookie on 2019/10/24.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] ={1,8,10,100,312,312,312,312,312,412,1000};
        List<Integer> integers = binarySearchNew(arr, 0, arr.length - 1, 312);
        System.out.println("索引为 "+integers);
    }
    /**
     *
     * @param arr 数组
     * @param left 左面的索引
     * @param right 右面的索引
     * @return
     */
    public static int binarySerach(int []arr,int left,int right,int findVal) {
        //如果left>right 说明递归
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) {
            return binarySerach(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySerach(arr, left, mid - 1, findVal); //向
        } else {
            return mid;
        }
    }

    /**
     * @param arr
     * @param left
     * @param right
     * @param findVal
     * @return
     */
    public static List<Integer> binarySearchNew(int [] arr, int left, int right, int findVal){
        //当left>right时 直接返回
        if(left>right){
            return new ArrayList<Integer>();
        }
        int mid = (left+right)/2;
        int midVal=arr[mid];

        //向右递归
        if(findVal>midVal){
            return binarySearchNew(arr,mid+1,right,findVal);
        }else if(findVal<midVal){
            return binarySearchNew(arr,left,mid-1,findVal);
        }else{
            List<Integer> resIndexList = new ArrayList<>();
            //向mid索引值的左边 满足1000的元素下标 加入到ArrayList集合
            int temp = mid-1;
            while (true){
                if (temp < 0 || arr[temp]!=findVal) {
                    //退出
                    break;
                }
                //否则就将temp存入到resIndexList里面
                resIndexList.add(temp);
                temp=temp-1;
            }
            resIndexList.add(mid);
            //向mid索引值的左边 满足1000的元素下标 加入到ArrayList集合
            temp=mid+1;
            while (true){
                if (temp > arr.length-1 || arr[temp]!=findVal) {
                    //退出
                    break;
                }
                //否则就将temp存入到resIndexList里面
                resIndexList.add(temp);
                temp=temp+1;
            }
            return resIndexList;
        }
    }
    }
