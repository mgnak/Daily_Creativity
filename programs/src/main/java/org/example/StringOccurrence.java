package org.example;
import java.util.Scanner;

public class StringOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        int count = 0;
    for (int i = 0; i < str.length(); i++) {
    if (strArr[i].equals(str)) {
    count++;
    }
    }
    System.out.println(count);
    }
}
