package shejimoshi.DependecyIncersion.improve;

/**
 * Created by jxy on 2021/4/20 0020 18:55
 */
public class DependcyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Weixin());
    }
}

//定义接口
interface Irceiver{
    public String getInfo();
}

class Email implements Irceiver{
    public String getInfo(){
        return "电子邮件信息：hello,world";
    }
}

//增加微信
class Weixin implements Irceiver{

    @Override
    public String getInfo() {
        return "电子信息邮件：hello ok";
    }
}


/**
 * 方式1 分析
 * 1.简单，比较容易想到
 * 2.如果我们获取的对象是微信，短信，则新增类，同时Person也要新增加接受方法
 */
class Person{
    //这里我们是对接口的依赖
    public void receive(Irceiver irceiver){
        System.out.println(irceiver.getInfo());
    }
}