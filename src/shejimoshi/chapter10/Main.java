package shejimoshi.chapter10;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 12:40 下午
 */
public class Main {
    public static void main(String[] args) {
        TestPaper a = new TestPaperA();
        System.out.println("学生甲的答案 ");
        a.testQuestion1();
        a.testQuestion2();

        System.out.println("\n************************\n");

        TestPaperB b = new TestPaperB();
        System.out.println("学生乙的答案 ");
        b.testQuestion1();
        b.testQuestion2();
    }
}
