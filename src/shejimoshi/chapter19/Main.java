package shejimoshi.chapter19;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 1:47 下午
 */
public class Main {
    public static void main(String[] args) {
        Component root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Component comp = new Composite("Composite X");
        comp.add(new Leaf("leaf A"));
        comp.add(new Leaf("leaf B"));

        root.add(comp);

        root.display(1);
    }
}
