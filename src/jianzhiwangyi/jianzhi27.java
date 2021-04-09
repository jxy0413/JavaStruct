/**
 * @(#)jianzhi27.java, 2021-03-25.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package jianzhiwangyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * jianzhi27
 *
 * @author jiaxiangyu
 * @since 2021/03/25
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
 * 则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba
 */
public class jianzhi27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> resultList = new ArrayList();
        if(str.length()==0){
            return (ArrayList<String>) resultList;
        }
        fun(str.toCharArray(),resultList,0);
        Collections.sort(resultList);
        return resultList;
    }
    
    private void fun(char[]ch,List<String>list,int i){
        if(i==ch.length-1){
            //判断一下是否重复
            if(!list.contains(new String(ch))){
                list.add(new String(ch));
                return;
            }
        }else{
            for(int j=i;j<ch.length;j++){
                swap(ch,i,j);
                fun(ch,list,i+1);
                swap(ch,i,j);
            }
        }
    }
    
    private void swap(char [] str,int i,int j){
        if(i!=j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }
    
    public static void main(String[] args) {
        jianzhi27 jianzhi27 = new jianzhi27();
        ArrayList<String> abc = jianzhi27.Permutation("abc");
        System.out.println(abc.toString());
    }
}