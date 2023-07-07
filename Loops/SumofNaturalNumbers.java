package Loops;

import java.util.Scanner;

public class SumofNaturalNumbers {
//using while loop:
//     public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter number:");
//            int n=sc.nextInt();
//            int sum=0;
//            int i=1;
//            while(i<=n){
//             sum=sum+i;
//             i++;
//            }
//          System.out.print("Sum is:"+sum);
//     }
// }

//using for loop:
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int n=sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum=sum+i;
//         }
//         System.out.println(sum);
//     }
// }
//using do-while
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        do{
            sum=sum+i;
            i++;
        }while(i<=n);
    System.out.println(sum);
    }
}