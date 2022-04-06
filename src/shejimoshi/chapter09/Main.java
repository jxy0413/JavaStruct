package shejimoshi.chapter09;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 3:54 下午
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("nan", "20");
        a.setWorkExpericen("1994-2000", "三块");


        Resume b = (Resume) a.clone();
        b.setPersonalInfo("nv", "11");
        b.setWorkExpericen("1994-2001", "三块1");


        a.display();
        b.display();
    }
}
