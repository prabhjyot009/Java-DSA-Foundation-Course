package Basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println(x+" is Even");
            }
        else{
            System.out.println(x+" is Odd");
        }
    }
}
