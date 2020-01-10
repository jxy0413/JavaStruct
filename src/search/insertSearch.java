package search;

/**
 * Created by jxy on 2019/10/25.
 */
public class insertSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int index = insertValueSearch(arr, 0, arr.length - 1, 1);
        System.out.println("索引为 "+index);
    }

    /**
     *
     * @param arr 数组
     * @param left 左索引
     * @param right 右索引
     * @param findVal 查找值
     * @return
     */
    public static int insertValueSearch(int [] arr,int left,int right,int findVal){
        System.out.println("调用。。。");
           //不满足条件的值
           if(left>right||findVal<arr[0]||findVal>arr[arr.length-1]){
               return -1;
           }
           int mid=left+(right-left)*(findVal-arr[left])/(arr[right]-arr[left]);
           int midVal=arr[mid];
           if(findVal>midVal){
               //向右递归
               return insertValueSearch(arr,mid+1,right,findVal);
           }else if(findVal<mid){
               //向左递归
               return insertValueSearch(arr,mid,right-1,findVal);
           }else {
               return mid;
           }
    }

}
