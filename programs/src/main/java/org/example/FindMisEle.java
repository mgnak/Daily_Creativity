package org.example;

import java.util.Scanner;

//Find Missing element
public class FindMisEle {
    static int findMissingNumber(int[] arr,int n) {
        int N =n+1;
        int totsum=N*(N+1)/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return totsum-sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findMissingNumber(arr,n));
    }
}
