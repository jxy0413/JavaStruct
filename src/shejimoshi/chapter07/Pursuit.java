package shejimoshi.chapter07;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 12:53 下午
 * 追求着类
 */
public class Pursuit implements IGiveGift{
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println(mm.getName() + " 送你洋娃娃");
    }

    @Override
    public void GiveFlower() {
        System.out.println(mm.getName() + " 送你鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm.getName() + " 送你巧克力");
    }
}
