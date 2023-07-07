package Loops;

import java.util.Scanner;

public class SumofNaturalNumbers {
//using while loop:
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter number:");
           int n=sc.nextInt();
           int sum=0;
           int i=1;
           while(i<=n){
            sum=sum+i;
            i++;
           }
         System.out.print("Sum is:"+sum);
    }
}

//using for loop: