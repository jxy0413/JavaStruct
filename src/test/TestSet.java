package test;

import java.util.HashSet;

public class TestSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println(set.add(1));
        boolean add = set.add(1);
        System.out.println(add);
    }
}
