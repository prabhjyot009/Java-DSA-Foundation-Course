package Loops;

import java.util.Scanner;

// public class StreamOfIntegers {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int n=sc.nextInt();
//         int sum=0;
//         while(n != -1){
//             sum+=n;
//             n=sc.nextInt();
//         }
//     System.out.println(sum);
//     }
// }

//using do While
public class StreamOfIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int sum=0; 
        do{
            sum+=n;
            n=sc.nextInt();
        }while(n != -1);
    System.out.println(sum);
    }
}
