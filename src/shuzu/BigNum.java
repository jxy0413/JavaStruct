package shuzu;

/**
 * @author jiaxiangyu
 * @date 2022/2/25 9:14 上午
 */
public class BigNum {
    /**
     * 以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
     * @param s
     * @param t
     * @return
     */
    public static String slove(String s, String t){
         //todo 保证s是长串
         if(s.length() < t.length()){
             String temp = s;
             s = t;
             t = temp;
         }
         int lonLen = s.length();
         int shortLen = t.length();
         int carry = 0;
         StringBuilder sb = new StringBuilder();

         for(int i=0; i < shortLen; i++){
             int add = (t.charAt(shortLen - 1 - i) - '0') +  (s.charAt(lonLen - 1 - i) - '0') + carry;
             sb.append(add % 10);
             carry = add / 10;
         }

         for(int i = shortLen; i < lonLen; i++){
             int add = (s.charAt(lonLen - 1 - i) - '0') + carry;
             sb.append(add % 10);
             carry = carry / 10;
         }

         if(carry != 0){
             sb.append(carry);
         }
         return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(slove("121", "86"));
    }
}
