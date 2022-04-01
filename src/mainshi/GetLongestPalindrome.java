package mainshi;

/**
 * @author jiaxiangyu
 * @date 2022/3/2 9:31 上午
 */
public class GetLongestPalindrome {
    public static int getLongestPalindromeBaoli(String A){
        int maxLen = 0;
        for(int i=0; i<A.length(); i++){
            for(int j=i+1; j<=A.length(); j++){
                String now = A.substring(i, j);
                if(isPalindrome(now) && now.length() > maxLen){
                    maxLen = now.length();
                }
            }
        }
        return maxLen;
    }

    private static boolean isPalindrome(String s){
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(getLongestPalindromeBaoli("ababc"));
    }
}
