package org.example;
import java.util.*;

public class MinMaxList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 8, 20, 3);
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Max: " + max + ", Min: " + min);
    }
}