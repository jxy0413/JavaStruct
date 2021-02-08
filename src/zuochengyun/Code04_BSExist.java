package zuochengyun;

public class Code04_BSExist {
    public static boolean exist(int [] sortedArr,int num){
        if(sortedArr==null||sortedArr.length==0){
            return false;
        }
        int low = 0;
        int high = sortedArr.length-1;
        int mid = 0;
        while(low<=high){
            mid = low+((high-low)>>1);
            if(sortedArr[mid]==num){
                return true;
            }else if(sortedArr[mid]>num){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}
