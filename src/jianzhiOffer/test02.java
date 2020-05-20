package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-18
 */
public class test02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We are Happy");
        System.out.println(replaceSpace(sb));
    }
    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
     * @param str
     * @return
     */
    public static String replaceSpace(StringBuffer str) {
        StringBuffer out = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char b= str.charAt(i);
            if(String.valueOf(b).equals(" ")){
                out.append("%20");
            }else {
                out.append(b);
            }
        }
        return out.toString();
    }
}
