package cn.bjfu.javaStruct.leetcode;

import java.util.HashMap;

/**
 * Created by jxy on 2020/12/16 0016 21:41
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * 示例1:
 *
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 *
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 *
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例 4:
 *
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-pattern
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode3 {
    public static boolean wordPattern(String pattern,String s){
        if(pattern==null||s==null){
            return false;
        }
        String[] string = s.split(" ");
        if(pattern.length()!=string.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap();
        for(int i=0;i<pattern.length();i++){
            char tmp = pattern.charAt(i);
            //key存在
            if(map.containsKey(tmp)){
                //不对应就失败
                if(!map.get(tmp).equalsIgnoreCase(string[i])){
                    return false;
                }
            }else {
                if(map.containsValue(string[i])){
                    return false;
                }else{
                    map.put(tmp,string[i]);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b = wordPattern("aabb", "dog dog1 cat cat");
        System.out.println(b);
    }
}
