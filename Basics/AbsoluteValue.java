package Basics;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            int n1;
            n1=n*-1;
            System.out.println("the absolute value is:"+n1);
        }
        else{
            System.out.println(n);
        }
    }
}
