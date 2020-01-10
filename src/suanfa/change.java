package suanfa;

import java.util.ArrayList;

/**
 * Created by jxy on 2020/1/9.
 */
public class change {
    public static void main(String[] args) {
        int i = 1;
        String s = "1";
        ArrayList<String> list =new ArrayList<>();
        list.add(s);
        change c = new change();
        c.change(i);
        c.change1(s);
        c.change2(list);

        System.out.println(i);
        System.out.println(s);
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
        System.out.println(list.size());
    }
    public  void change(int i){
         i = 0;
    }

    public  void change1(String s){
        s="0";
    }

    public void change2(ArrayList list){
        list.add("");
    }

}
