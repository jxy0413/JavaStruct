package tanxin;

public class Money {
    public static void main(String[] args) {
        //钞票金额
        int [] arr = {200,100,20,10,5,1};
        int num = 6; //6种面额
        int X = 628;  //钱
        int count = 0 ; //总数
        for(int i=0;i<arr.length;i++){
            int use = X /arr[i];
            count += use;
            X = X - arr[i] * use;
            System.out.println("需要面额为"+arr[i]+"的"+use+"张");
            System.out.println("还剩"+X+"元");
        }
        System.out.println("共找钱了"+count+"次");
    }
}
