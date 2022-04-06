package shejimoshi.chapter07;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 1:44 下午
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy deili = new Proxy(jiaojiao);

        deili.GiveChocolate();
        deili.GiveDolls();
        deili.GiveFlower();
    }
}
