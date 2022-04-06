package shejimoshi.chapter17;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 10:34 下午
 */
public class Adaptee {
    public void specificQequest(){
        System.out.println("特殊请求！");
    }

    static class Adapter extends Target{
        private Adaptee adaptee = new Adaptee();

        @Override
        public void request() {
            adaptee.specificQequest();
        }
    }
}
