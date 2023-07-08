package Patterns;

import java.util.Scanner;

public class NumericalHollowPyramidPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows");
        int r=sc.nextInt();
        System.out.print("Enter columns");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==4 || i+j==5 || j-i==3){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }
}
