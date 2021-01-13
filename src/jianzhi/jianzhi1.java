package jianzhi;

public class jianzhi1 {
    public  boolean Find(int target,int [][] array){
        for(int i=0;i<array.length;i++){
            int low = 0;
            int high = array[i].length-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(array[i][mid]>target){
                     high = mid -1;
                }else if(array[i][mid]<target){
                     low  = mid +1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
}
