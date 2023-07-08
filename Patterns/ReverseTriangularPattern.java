package Patterns;

import java.util.Scanner;

public class ReverseTriangularPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r+1-i);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
