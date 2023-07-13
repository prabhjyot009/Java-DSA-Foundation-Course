package Arrays;

import java.util.Scanner;

public class InputInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //user size input
        System.out.println("ENter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        //user elements input:
        System.out.println("Enter Arrays Elements of "+n+" size");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //print inputed array
        for(int i=0;i<arr.length;i++){
            System.out.print("Elements are"+arr[i]+" ");
        }
    }
}