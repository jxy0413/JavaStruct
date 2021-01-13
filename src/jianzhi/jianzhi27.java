package jianzhi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class jianzhi27 {
    public static void main(String[] args) {
        jianzhi27 jianzhi27 =new jianzhi27();
        System.out.println(jianzhi27.Permutation("aa"));
    }
    public  ArrayList<String> Permutation(String str) {
          ArrayList<String> resultList = new ArrayList();
          if(str.length()==0){
              return resultList;
          }
          //递归的初始值
          fun(str.toCharArray(),resultList,0);
          Collections.sort(resultList);
          return resultList;
    }

    private void fun(char[] ch, ArrayList<String> list, int i) {
          //终止条件
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

    private void swap(char[] ch, int i, int j) {
        if(i!=j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] =temp;
        }
    }


}
