package Arrays.MultiDimensionalArray;

import java.util.Scanner;

public class Practice {

    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void sumArray(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(r1!=r2 && c1!=c2){
            System.out.println("Some problem in array initialization");
            return;
        }
        int[][] sum=new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of matrix a and b is");
        printArray(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r1=sc.nextInt();
        System.out.println("Enter number of columns:");
        int c1=sc.nextInt();

        int[][] a=new int[r1][c1];

        System.out.println("Enter "+r1*c1+" elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter number of rows");
        int r2=sc.nextInt();
        System.out.println("Enter number of columns:");
        int c2=sc.nextInt();

        int[][] b=new int[r1][c1];

        System.out.println("Enter "+r1*c1+" elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix a: ");
        printArray(a);
        System.out.println("Matrix b: ");
        printArray(b);
        sumArray(a, r1, c1, b, r2, c2);
    }
}
