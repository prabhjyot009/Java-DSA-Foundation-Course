import java.util.Scanner;

public class DecreasingNatural {
        static void printDecreasing(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(""+n+" ");
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasing(n);
    }   
}
