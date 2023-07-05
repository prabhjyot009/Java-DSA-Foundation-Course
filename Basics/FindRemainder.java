package Basics;

import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter dividend:");
        int dividend=sc.nextInt();
        System.out.print("Enter divisor:");
        int divisor=sc.nextInt();
        int quotient=dividend/divisor;
        int Remainder=dividend-(divisor*quotient);
        System.out.println("Remainder is:"+Remainder);
    }
}
