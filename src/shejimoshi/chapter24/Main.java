package shejimoshi.chapter24;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 10:41 下午
 */
public class Main {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int [] requests = {2,5,14,22,18,3,27,20};

        for(int res : requests){
            h1.HandleRequest(res);
        }
    }
}
