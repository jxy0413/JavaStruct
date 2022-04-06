package shejimoshi.chapter19;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 2:22 下午
 */
public class Utils {
    public static String stringLine(int depth){
        String str = "-";
        String line = "";
        for(int i = 0; i < depth; i++){
            line += str;
        }
        return line.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringLine(5));
    }
}
