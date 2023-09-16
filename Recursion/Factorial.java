import java.util.Scanner;

public class Factorial {

    // static void printFact(int n){
    //     int i=1;
    //     int fact=1;
    //     while(i<=n){
    //         fact=fact*i;
    //         i++;
    //     }
    //     System.out.println(fact);
    // }
    static int printFactRecursion(int n){
        if(n==0) return 1;
        return n * printFactRecursion(n-1);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        //  printFact(n);
         System.out.println(printFactRecursion(n));
    }
}
