package Loops;

import java.util.Scanner;

public class Power {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        int i=1;
        int power=1;
        while(i<=b){
            power*=a;
            i++;
        }
        System.out.println(power); 
    }
}