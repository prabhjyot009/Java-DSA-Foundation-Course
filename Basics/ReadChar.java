package Basics;

import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println("at postion 0 is:"+ch);
    }
}
