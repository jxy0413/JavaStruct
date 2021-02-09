package zuochengyun;

//一个数组中有一种数出现了奇数次，其他数都出现了偶数次
//怎么找到并打印这种数
public class Code08_jishuAndoushu {
    public static int fun(int arr[]){
        int sum = arr[0];
        for(int i=1;i<arr.length;i++) {
            sum ^= arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,4,2,1};
        System.out.println(fun(arr));
    }
}
