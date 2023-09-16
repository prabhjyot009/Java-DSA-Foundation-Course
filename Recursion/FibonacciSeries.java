import java.util.Scanner;

public class FibonacciSeries {
    // static void printFibonacci(int n){
    //     int p1=0;
    //     int p2=1;
    //     int p3=0;
    //     System.out.print(p1+" "+p2);
    //     for (int i = 2; i < n; i++) {
    //         p3=p1+p2;
    //         System.out.print(" "+p3);
    //         p1=p2;
    //         p2=p3;
    //     }
    // }
    static int printFibonacciRecursion(int n){ 
               if(n==0 || n==1){
                return n;
               }
        return printFibonacciRecursion(n-1)+printFibonacciRecursion(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // printFibonacci(n);
        System.out.println("Fibonacci number: "+printFibonacciRecursion(n));
        System.out.print("Series:"+" ");
        for (int i = 0; i <=10; i++) {
            System.out.print(printFibonacciRecursion(i)+" ");
        }
    }
}
