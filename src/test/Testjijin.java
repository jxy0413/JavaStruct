package test;

public class Testjijin {
    public static void main(String[] args) {
        System.out.println(get(20, 20));
    }

    public static double get(double r,int n){
        double k1 = 1.3;
        for(int i=0;i<n;i++){
            r =r*k1;
        }
        return r;
    }
}
