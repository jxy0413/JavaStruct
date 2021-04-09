/**
 * @(#)jianzhi36.java, 2021-04-06.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

/**
 * jianzhi36
 *
 * @author jiaxiangyu
 * @since 2021/04/06
 * 统计一个数字在升序数组中出现的次数
 * [1,2,3,3,3,3,4,5],3
 * 4
 *
 * [1,3,3,3,3,4,5],2
 */
public class jianzhi36 {
    
    public int GetNumberOfK(int[] array, int k) {
        if(array==null || array.length==0){
            return 0;
        }
        int firstKey = GetFirstKey(array,k,0,array.length-1);
        int endKey = GetEndtKey(array,k,0,array.length-1);
        if(firstKey==-1||endKey==-1){
            return 0;
        }else{
            return endKey-firstKey+1;
        }
    }
    
    private int GetFirstKey(int[] array, int k, int start, int end) {
         while (start<=end){
             int mid = (start+end) /2 ;
             if(array[mid]>k){
                 end = mid - 1;
             }else if(array[mid]<k){
                 start = mid + 1;
             }else{
                 if((mid>0&&array[mid-1]!=k)||mid==0){
                     return mid;
                 }else{
                     end = mid - 1;
                 }
             }
         }
         return -1;
    }
    
    private int GetEndtKey(int[] array, int k, int start, int end) {
        while (start<=end){
            int mid = (start+end) /2 ;
            if(array[mid]>k){
                end = mid - 1;
            }else if(array[mid]<k){
                start = mid + 1;
            }else{
                if((mid<array.length-1&&array[mid+1]!=k)||mid==array.length-1){
                    return mid;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        jianzhi36 jianzhi36 = new jianzhi36();
        int arr[] = {1,3,3,3,3,4,5};
        System.out.println(jianzhi36.GetNumberOfK(arr,2));
    }
}