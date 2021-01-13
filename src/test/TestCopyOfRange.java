package test;

import java.util.Arrays;

public class TestCopyOfRange {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int[] ints = Arrays.copyOfRange(a, 1, 3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
