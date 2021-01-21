package jianzhi;

public class jianzhi43 {
    public String LeftRotateString(String str,int n) {
             if(str==null||n>str.length()){
                 return str;
             }
             return str.substring(n)+str.substring(0,n);
    }

    public static void main(String[] args) {
        jianzhi43 jianzhi43 =new jianzhi43();
        System.out.println(jianzhi43.LeftRotateString("abcXYZdef",3));
    }
}
