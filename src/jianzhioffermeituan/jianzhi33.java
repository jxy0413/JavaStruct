package jianzhioffermeituan;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiaxiangyu
 * @date 2021/7/25 5:35 下午
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 */
public class jianzhi33 {
  public int FirstNotRepeatingChar(String str) {
      if(str.length() == 0){
        return -1;
      }
      Map<Character,Integer> map  = new HashMap();
      for(int i=0;i<str.length();i++){
         if(map.containsKey(str.charAt(i))){
             map.put(str.charAt(i), map.get(str.charAt(i))+1);
         }else{
             map.put(str.charAt(i), 1);
         }
      }

      for(int i=0;i<str.length();i++){
        if(1 == map.get(str.charAt(i))){
          return i;
        }
      }
      return -1;
  }

  public static void main(String[] args) {
    jianzhi33 jianzhi33 = new jianzhi33();
    System.out.println(jianzhi33.FirstNotRepeatingChar("google"));
  }
}
