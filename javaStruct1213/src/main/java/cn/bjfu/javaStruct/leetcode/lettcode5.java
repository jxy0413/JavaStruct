package cn.bjfu.javaStruct.leetcode;

/**
 * Created by jxy on 2020/12/18 0018 22:01
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 * 示例 2：
 *
 * 输入：s = "", t = "y"
 * 输出："y"
 * 示例 3：
 *
 * 输入：s = "a", t = "aa"
 * 输出："a"
 * 示例 4：
 *
 * 输入：s = "ae", t = "aea"
 * 输出："a"
 *  
 *
 * 提示：
 *
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s 和 t 只包含小写字母
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class lettcode5 {
    public static char findTheDifference(String s, String t) {
        int as = 0,at = 0;
        for(int i=0;i<s.length();i++){
            as+=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            at+=t.charAt(0);
        }
        return (char)(at-as);
    }

    public static void main(String[] args) {
        char theDifference = findTheDifference("jia", "jial");
        System.out.println(theDifference);
    }
}
