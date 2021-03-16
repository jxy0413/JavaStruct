package jianzhiwangyi;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/16 17:08
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 */
public class jianzhi2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return string字符串
     */
    public static String replaceSpace (String s) {
        // write code here
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(' '==(c)){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str = "We Are Happy";
        System.out.println(replaceSpace(str));
    }
}
