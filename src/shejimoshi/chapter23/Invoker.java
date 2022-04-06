package shejimoshi.chapter23;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 9:50 下午
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
