package jvm;

public class MyObject {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.getClass().getClassLoader());
        System.out.println("**************************************");
        MyObject object1 = new MyObject();
        System.out.println(object1.getClass().getClassLoader());
        System.out.println(object1.getClass().getClassLoader().getParent());
        System.out.println(object1.getClass().getClassLoader().getParent().getParent());
    }
}
