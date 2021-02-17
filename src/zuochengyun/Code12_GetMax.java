package zuochengyun;

public class Code12_GetMax {
    public static int process(int arr[],int L,int R){
        if(L==R){
            return arr[L];
        }
        int mid = L+((R-L)>>1);
        int leftMax = process(arr,L,mid);
        int rightMax = process(arr,mid+1,R);
        return Math.max(leftMax,rightMax);
    }

    public static void main(String[] args) {
        int arr [] = {2,1,3,4,5,2,12,3};
        System.out.println(process(arr,0,arr.length-1));
    }
}
