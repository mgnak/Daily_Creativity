package org.example;

import java.util.Scanner;

public class Palindrome {
//    public static String palindrome(int n) {
//        String n1 = Integer.toString(n);
//        StringBuilder reversed = new StringBuilder(n).reverse();
//        return (n1.equals(reversed)) ? "Palindrome" : "Not Palindrome";
//    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(palindrome(n));
//    }
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String revStr=new StringBuilder(A).reverse().toString();
        if(A.equals(revStr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}