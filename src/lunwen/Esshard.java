package lunwen;

public class Esshard {
    public static void main(String[] args) {
        double shart = getShart(100);
        System.out.println(shart);
    }

    public static double getShart(double num){
        double k1 = 0.2;
        double k2 = 2.1;
        double k3 = 0.2;
        double k4 = 0.6;
        double shard = (k1*4+k2*num/20+k3*8)*k4;
        return shard;
    }
}
