package mainshi;

/**
 * Created by jxy on 2020/1/5.
 * 判断是否为回文串
 */
public class huiwenchuan {
    public static void main(String[] args) {
        //测试
        String str = "aaabbbbaaa";
        String str1="abc";
        System.out.println(isHuiWen(str));
        System.out.println(isHuiWen(str1));
    }

    public static boolean isHuiWen(String str){
        StringBuilder sb =new StringBuilder(str).reverse();

        String newString = new String(sb);

        if(newString.equals(str)){
            return true;
        }else {
            return  false;
        }
    }
}
