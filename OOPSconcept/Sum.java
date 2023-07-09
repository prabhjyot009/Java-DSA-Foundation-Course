package OOPSconcept;

import java.util.Scanner;

class Algebra{
    int sum(int a,int b){
        int ans=a+b;
        return ans;
    }
}
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int x=sc.nextInt();
        System.out.print("Enter b:");
        int y=sc.nextInt();
        Algebra obj1=new Algebra();
        int ans=obj1.sum(x, y);
        System.out.println("Ouput:"+ans);
    }
}
