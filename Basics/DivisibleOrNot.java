package Basics;

import java.util.Scanner;

public class DivisibleOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0 && n%3!=0){
            System.out.print(n+"it is divisible by 5");
        }
        else{
            System.out.print(n+"not divisible");
        }
    }
}
