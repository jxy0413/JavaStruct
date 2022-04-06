package shejimoshi.chapter18;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 12:10 下午
 */
public class Main {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("on");
        o.show();

        Caretaker c = new Caretaker();
        Memento mento = o.createMento();

        o.setState("off");
        o.show();
        //恢复原始数据
        o.setMemonto(mento);
        o.show();
        /**
         * 其实是把保存的细节封装到了Memento中，哪一天更改保存的细节
         * 也不用影响客户端了
         */
    }
}
