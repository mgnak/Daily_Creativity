package org.example;
import java.util.Scanner;

public class StringOccurrence {
    public static void main(String[] args) {
        String vowels = "aeiouAEIOU";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        int vowelCount = 0, nonVowelCount = 0;
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            } else {
                nonVowelCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Non-vowels: " +  nonVowelCount);
        int count = vowelCount + nonVowelCount;
        System.out.println("Overall Count: " + count);
    }
}
