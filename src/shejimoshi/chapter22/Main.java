package shejimoshi.chapter22;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 9:15 下午
 */
public class Main {
    public static void main(String[] args) {
        HandsetBrand ab;
        ab = new HandsetBrandN();

        ab.SetHandsetSoft(new HandsetGame());
        ab.run();

        ab.SetHandsetSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();

        ab.SetHandsetSoft(new HandsetGame());
        ab.run();

        ab.SetHandsetSoft(new HandsetAddressList());
        ab.run();

    }
}
