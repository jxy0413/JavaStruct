package shejimoshi.chapter16bak;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 9:29 下午
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(10);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();

        work.setHour(17);
        work.writeProgram();

        work.setFinish(false);
        work.writeProgram();

        work.setHour(19);
        work.writeProgram();

        work.setHour(22);
        work.writeProgram();
    }
}
