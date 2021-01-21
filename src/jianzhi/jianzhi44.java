package jianzhi;
// "nowcoder. a am I"
// "I am a nowcoder."
public class jianzhi44 {
    public String ReverseSentence(String str) {
        StringBuffer sb = new StringBuffer();
        if(str.length()<=0||str.trim().equals("")){
            return str;
        }
        String[] strSet = str.split(" ");
        int length = strSet.length;
        for(int i=length-1;i>0;i--){
            sb.append(strSet[i]+" ");
        }
        sb.append(strSet[0]);
        return sb.toString();
    }

    public static void main(String[] args) {
        jianzhi44 jianzhi44 =new jianzhi44();
        System.out.println(jianzhi44.ReverseSentence("nowcoder. a am I"));
    }
}
