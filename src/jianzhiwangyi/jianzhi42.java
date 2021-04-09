/**
 * @(#)jianzhi42.java, 2021-04-09.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.Locale;
import java.util.Stack;

/**
 * jianzhi42
 *
 * @author jiaxiangyu
 * @since 2021/04/09
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，
 * 有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。
 * 后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class jianzhi42 {
    public String ReverseSentence(String str) {
          if(str.trim().equals("") && str.length()==0){
              return str;
          }
          Stack<String>reverse = new Stack();
          String string = str.trim();
    
          String[] s = string.split(" ");
          for(int i=0;i<s.length;i++){
              reverse.push(s[i]);
          }
          string = reverse.pop();
          while (!reverse.isEmpty()){
              string = string + " " + reverse.pop();
          }
          return string;
    }
    
    public static void main(String[] args) {
        jianzhi42 jianzhi42 = new jianzhi42();
        System.out.println(jianzhi42.ReverseSentence("student. a am I"));
    }
}