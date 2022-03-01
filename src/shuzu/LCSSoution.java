package shuzu;

/**
 * @author jiaxiangyu
 * @date 2022/2/26 9:20 上午
 */
public class LCSSoution {
    /**
     *
     * @param str1 abc1231jia
     * @param str2 bc1231shi
     * @return
     */
    public static String lCS(String str1, String str2){
       StringBuilder sb = new StringBuilder();
       int start = 0;
       int end = 1;
       while(end < str1.length() + 1){
           if(str2.contains(str1.substring(start, end))){
                 if(sb.length() < end - start){
                     sb.delete(0,sb.length());
                     sb.append(str1.substring(start, end));
                 }
           }else{
               //开始扩
               start++;
           }
           end++;
       }
       if(sb.length() == 0){
           return "-1";
       }
       return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(lCS("abc1231jia", "bc1231shi"));
    }
}
