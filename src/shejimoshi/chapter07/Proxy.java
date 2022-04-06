package shejimoshi.chapter07;

/**
 * @author jiaxiangyu
 * @date 2022/4/2 1:40 下午
 */
public class Proxy implements IGiveGift{
    Pursuit gg;

    public Proxy(SchoolGirl mm){
        gg = new Pursuit(mm);
    }

    @Override
    public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override
    public void GiveFlower() {
        gg.GiveFlower();
    }

    @Override
    public void GiveChocolate() {
        gg.GiveChocolate();
    }
}
