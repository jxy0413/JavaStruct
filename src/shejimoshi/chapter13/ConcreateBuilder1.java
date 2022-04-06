package shejimoshi.chapter13;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 8:51 下午
 */
public class ConcreateBuilder1 extends Builder{
    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.add("部件A");
    }

    @Override
    public void BuildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
