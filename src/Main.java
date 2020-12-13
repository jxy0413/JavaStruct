import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("jia");
        System.out.println(list.remove(list.size()-1));
    }
}
