package jianzhi;

public class jianzhi2 {
    public static String replaceSpace(StringBuffer str){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(" ".equals(String.valueOf(c))){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
    }
}
