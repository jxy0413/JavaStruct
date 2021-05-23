package juc;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//import java.util.concurrent.atomic.AtomicReference;
//
///**
// * @Author jiaxiangyu
// * @Date 2021/3/5 11:44
// */
//public class AtomicRefrenceDemo {
//    public static void main(String[] args) {
//       User z3 = new User("zhangsan",22);
//       User l4 = new User("lisi",23);
//        AtomicReference atomicReference = new AtomicReference();
//        atomicReference.set(z3);
//        System.out.println(atomicReference.compareAndSet(z3, l4) + "\t" + atomicReference.get().toString());
//        System.out.println(atomicReference.compareAndSet(z3, l4) + "\t" + atomicReference.get().toString());
//    }
//}
//@Data
//class User{
//    private String userName;
//    private int age;
//
//    public User(String userName, int age) {
//        this.userName = userName;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "userName='" + userName + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}