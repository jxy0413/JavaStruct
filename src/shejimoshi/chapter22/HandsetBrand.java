package shejimoshi.chapter22;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 8:50 下午
 */
public abstract class HandsetBrand {
    protected HandsetSoft handsetSoft;

    public void SetHandsetSoft(HandsetSoft soft){
        this.handsetSoft = soft;
    }

    public abstract void run();
}
