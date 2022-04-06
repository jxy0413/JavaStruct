package shejimoshi.chapter13;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 8:52 下午
 */
public class ConcrateBuilder2 extends Builder{
    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.add("部件X");
    }

    @Override
    public void BuildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
