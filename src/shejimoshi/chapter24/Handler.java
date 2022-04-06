package shejimoshi.chapter24;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 10:23 下午
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void HandleRequest(int request);
}
