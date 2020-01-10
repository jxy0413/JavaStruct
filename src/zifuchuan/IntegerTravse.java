package zifuchuan;

/**
 * Created by jxy on 2019/10/30.
 */
public class IntegerTravse {
    public static void main(String[] args) {
        //给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
        int x = 105;
        System.out.println(reverse(x));
    }
    public static int reverse(int x){
        long res=0;
        while (x!=0){
            res=res*10+x%10;
            x=x/10;
        }
        if((int)res!=res){
            return 0;
        }else{
            return (int)res;
        }
    }
}
