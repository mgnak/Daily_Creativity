package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str =sc.next().toLowerCase(); //"programming";
        Map<Character, Integer> count = new HashMap<>();
        for (char c : str.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        System.out.println(count); // {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
    }
}