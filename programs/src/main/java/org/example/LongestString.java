package org.example;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat", "elephant", "dog", "giraffe");
        String longest = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Longest: " + longest);
    }
}
