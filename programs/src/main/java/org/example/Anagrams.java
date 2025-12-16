package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static int anagrams (String str1, String str2){
        str1 = str1.replaceAll(" ", "").toUpperCase();
        str2 = str2.replaceAll(" ", "").toUpperCase();
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        if (Arrays.equals(charArray1, charArray2)) {
           return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String m = sc.nextLine();
        System.out.println(anagrams(n,m));
    }
}
