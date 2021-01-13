package jianzhi;

import java.util.HashMap;

//第一个只出现一次的字符
public class jianzhi34 {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(str==null){
            return -1;
        }
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                 int value = map.get(str.charAt(i));
                 map.put(str.charAt(i),value+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        jianzhi34 jianzhi34 = new jianzhi34();
        int google = jianzhi34.FirstNotRepeatingChar("google");
        System.out.println(google);
    }
}
