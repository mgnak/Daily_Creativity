package org.example;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] originalArray = {1, 21, 12, 3, 4, 4, 5};
        System.out.println("Array List: " + Arrays.toString(originalArray));
        Set<Integer> set = new HashSet<>();
        for (int num : originalArray) {
            set.add(num);
        }
        List<Integer> uniqueElements = new ArrayList<>(set);
        System.out.println(uniqueElements);
    }
}