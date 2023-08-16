package Arrays.MultiDimensionalArray;

import java.util.Scanner;

public class Addition {
        static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void sumArray(int[][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i][j]=s
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r1=sc.nextInt();
        System.out.println("Enter number of colomns");
        int c1=sc.nextInt();

        int[][] a=new int[r1][c1];

        System.out.println("Enter "+r1*c1+"elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter number of rows");
        int r2=sc.nextInt();
        System.out.println("Enter number of colomns");
        int c2=sc.nextInt();

        int[][] b=new int[r2][c2];

        System.out.println("Enter "+r2*c2+"elements");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix A:");
        printArray(a);
        System.out.println("Matrix A:");
        printArray(b);
        
    }
}
