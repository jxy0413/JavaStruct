package zuopackage2;
//给定一个数组arr，和一个数num，请把小于num的数放在数组的 左边，等于num的数放 在数组的中间，
// 大于num的数放在数组的 右边。要求额外空间复杂度O(1)，时间复杂度 O(N)
public class Code03_helianguoqi {
    public static void partiton(int []arr,int l,int r,int key){
        int less = l - 1; //小于边界
        int more = r + 1; //大于边界
        while(l<more){
            if(arr[l]<key){
                 swap(arr,++less,l++);
            }else if(arr[l]>key){
                 swap(arr,--more,l);
            }else{
                l++;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] test = {4,12,3,4,5,6};
        partiton(test, 0, test.length - 1, 4);
        for(int i:test){
            System.out.println(i);
        }
    }
}
