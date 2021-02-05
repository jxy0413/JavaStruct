package jvm;

public class MyObject {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.getClass().getClassLoader());

        MyObject object1 = new MyObject();
        System.out.println(object1.getClass().getClassLoader());
    }
}
