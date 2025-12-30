package org.example;
//move all 1 to the end of an array
import java.util.Arrays;

public class MoveOnes {
    public static void main(String[] args) {
        int[] a={1,2,0,2,1,4,5,1,3};
        int p=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=1){
                a[p++]=a[i];
            }
        }
        while(p<a.length){
            a[p]=1;
            p++;
        }
        System.out.println(Arrays.toString(a));
    }
}
