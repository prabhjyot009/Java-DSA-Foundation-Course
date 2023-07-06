package Basics;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side a:");
        int a=sc.nextInt();
        System.out.println("Enter side b:");
        int b=sc.nextInt();
        System.out.println("Enter side c:");
        int c=sc.nextInt();
        if((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Not Valid triangle");
        }
    }
}
