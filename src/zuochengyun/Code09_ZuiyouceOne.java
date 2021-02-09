package zuochengyun;

public class Code09_ZuiyouceOne {
     public static int sltion(int num){
         int k = num & (~num+1);
         return k;
     }

    public static void main(String[] args) {
        System.out.println(sltion(466));
    }
}
