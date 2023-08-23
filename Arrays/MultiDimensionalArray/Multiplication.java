package Arrays.MultiDimensionalArray;

import java.util.Scanner;

public class Multiplication {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mulArray(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1!=r2) {
            System.out.println("Wrong input - Addition not possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {// rows
            for (int j = 0; j < c2; j++) {// colos
                for (int k = 0; k < c2; k++) {
                    
                    mul[i][j] += (a[i][k]*b[i][k]);
                }
            }
        }
        System.out.println("Multiplication of Matrix A and Matrix B");
        printArray(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter number of colomns for matrix 1");
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter " + r1 * c1 + " elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number of rows for matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter number of colomns for matrix 2");
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("Enter " + r2 * c2 + " elements");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix A:");
        printArray(a);
        System.out.println("Matrix B:");
        printArray(b);
        mulArray(a, r1, c1, b, r2, c2);
    }
}
