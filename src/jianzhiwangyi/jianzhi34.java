/**
 * @(#)jianzhi34.java, 2021-03-30.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.HashMap;
import java.util.Map;

/**
 * jianzhi34
 *
 * @author jiaxiangyu
 * @since 2021/03/30
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 * 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 * "google" 返回4
 */
public class jianzhi34 {
    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0){
            return -1;
        }
        Map<Character,Integer> map = new HashMap();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        jianzhi34 jianzhi34 = new jianzhi34();
        System.out.println(jianzhi34.FirstNotRepeatingChar("google"));
    }
    
}