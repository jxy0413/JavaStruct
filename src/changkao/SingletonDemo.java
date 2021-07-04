package changkao;

/**
 * @author jiaxiangyu
 * @date 2021/7/3 10:57 下午
 */
public class SingletonDemo {

  private static SingletonDemo instance = null;

  private SingletonDemo(){
    System.out.println(Thread.currentThread().getName()+"\t 我是构造方法");
  }

  public static SingletonDemo getInstance(){
    if(instance==null){
      instance = new SingletonDemo();
    }
    return instance;
  }

  public static void main(String[] args) {
    System.out.println(SingletonDemo.getInstance() == SingletonDemo.instance);
  }
}
