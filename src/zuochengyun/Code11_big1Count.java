package zuochengyun;

public class Code11_big1Count {
    public static int bit1Count(int N){
        int count = 0 ;
        while (N!=0){
            int rightOne = N & (~N+1);
            count++;
            N^=rightOne;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(bit1Count(190));
    }
}
