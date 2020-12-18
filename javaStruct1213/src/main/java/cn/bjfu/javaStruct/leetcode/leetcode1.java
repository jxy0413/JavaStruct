package cn.bjfu.javaStruct.leetcode;

import java.util.*;

/**
 * Created by jxy on 2020/12/14 0014 10:22
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例:
 *
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/group-anagrams
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode1 {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String,List<String>> map = new HashMap<String, List<String>>();
         for(String str:strs){
             char[] chars = str.toCharArray();
             Arrays.sort(chars);
             String key = new String(chars);
             List<String> list = map.getOrDefault(key, new ArrayList<String>());
             list.add(str);
             map.put(key,list);
         }
         return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        leetcode1 leetcode1 = new leetcode1();
        String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = leetcode1.groupAnagrams(str);
        System.out.println(lists.toString());
    }
}
