package Basics;

import java.util.Scanner;

public class AreaPeriofRect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        int length=sc.nextInt();
        System.out.print("Enter width:");
        int width=sc.nextInt();
        int area=length*width;
        int peri=2*(length+width);
        if(area>peri){
            System.out.println(area+" Area is greater"+"than perimeter "+peri);
        }
        else{
            System.out.println(peri+" Perimeter is greater"+"than area "+area);
        }
    }
}
