package org.example;

import java.util.Scanner;
import java.lang.*;

public class ReverseString {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ReverseString1(s));
}
public static String ReverseString1(String s){
    StringBuilder reversed = new StringBuilder(s).reverse();
    return reversed.toString();
}
}