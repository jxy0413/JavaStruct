package shejimoshi.chapter01;

/**
 * @author jiaxiangyu
 * @date 2022/4/1 9:11 下午
 */
public class OperationSub extends Operation{
    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    @Override
    public double getResult() {
        return numberA - numberB;
    }
}
