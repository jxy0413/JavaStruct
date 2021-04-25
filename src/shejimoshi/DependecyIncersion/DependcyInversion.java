package shejimoshi.DependecyIncersion;

/**
 * Created by jxy on 2021/4/20 0020 18:55
 */
public class DependcyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
class Email{
    public String getInfo(){
        return "电子邮件信息：hello,world";
    }
}

/**
 * 方式1 分析
 * 1.简单，比较容易想到
 * 2.如果我们获取的对象是微信，短信，则新增类，同时Person也要新增加接受方法
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}