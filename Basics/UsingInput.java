package Basics;

import java.util.Scanner;

public class UsingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius:");
        double radius=sc.nextDouble();
        double pi=3.14;
        double area=pi*radius*radius;
        System.out.println("Area is:"+area);
    }
}
