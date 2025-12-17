package org.example;
//Find the sum of digits of a number.
public class GetSum {
    static int getSum (int num, int sum)
    {
        if (num == 0)
            return sum;

        sum += num % 10;
        return getSum (num / 10, sum);
    }
    public static void main (String[]args){
        int num = 12345, sum = 0;
        System.out.println ("Sum of digits : " +  getSum (num, sum));
    }
}
