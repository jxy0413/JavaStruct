package suanfa;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by jxy on 2019/11/1.
 */
public class dongTaiBangDing {
    public static void main(String[] args) {
        AAA a = new BBB();
        System.out.println(a.getResult());
    }
}
class AAA{
    public int i = 10;
    public int getResult(){
       return i+10;
    }
}
class BBB extends AAA{
    public int i = 20;
   /* public int getResult(){
        return i+10;
    }*/
}
