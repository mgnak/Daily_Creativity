package org.example;

import java.util.Scanner;

//Find the sum of digits of a number.
public class GetSum {
    static int getSum (int num, int sum) {
        if (num == 0)
            return sum;
        sum += num % 10;
        return getSum (num / 10, sum);
    }

    static int getsum1(int[] num){
        int sum = 0;
        for (int i : num)
            sum += i;
        return sum;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0;
        System.out.println ("Sum of digits : " +  getSum (num, sum));
        int[] num1={2,3,4,5,6,7};
        System.out.println("Sum of a array numbers"+getsum1(num1));
    }
}
