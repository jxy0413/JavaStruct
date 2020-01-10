package search;

/**
 * Created by Cookie on 2019/10/23.
 */
public class SeqSearch {
    public static void main(String[] args) {
         int arr[]={-5,8,45,7,6};
         int index = seqSearch(arr,77);
         if(index==-1){
             System.out.println("在数组中并未找到");
         }else{
             System.out.println("数组的下标为 "+index);
         }
    }

    /**
     * 这里我们实现一个线性查找是找到一个满足条件的返回值后 就返回
     * @param arr
     * @param value
     * @return
     */
    public static int seqSearch(int []arr,int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return  -1;
    }
}
