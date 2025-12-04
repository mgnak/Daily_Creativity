import java.util.Scanner;
import java.lang.*;

public class ReverseString {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ReverseString(s));
}
public static String ReverseString(String s){
    StringBuilder reversed = new StringBuilder(s);
    return reversed.reverse().toString();
}
}