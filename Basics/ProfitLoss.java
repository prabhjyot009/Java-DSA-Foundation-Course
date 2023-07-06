package Basics;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Selling price:");
        int sp=sc.nextInt();
        System.out.print("Enter Cost price:");
        int cp=sc.nextInt();
        int profit;
        int loss;
        if(sp>cp){
            profit=sp-cp;
            System.out.println("Profit is:"+profit);
        }
        else{
            loss=cp-sp;
            System.out.println("Loss is:"+loss);
        }
    }
}
