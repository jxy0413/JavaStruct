package zuochengyun;

//找到两个数是奇数次 剩下是偶数次
public class Code10_liangzhushu {
    public static void slution(int arr[]){
        int eor = 0;
        for(int i=0;i<arr.length;i++){
            eor ^= arr[i];
        }
        int rightOne = eor & (~eor+1); //最右面的1
        int onlyOne = 0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&rightOne)!=0){
                onlyOne ^= arr[i];
            }
        }
        System.out.println(onlyOne+" "+(eor^onlyOne));
    }

    public static void main(String[] args) {
        int arr [] ={1,1,2,4,2,4,5,6};
        slution(arr);
    }
}
