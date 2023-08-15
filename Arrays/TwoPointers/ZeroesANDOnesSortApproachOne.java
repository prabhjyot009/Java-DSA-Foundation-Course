//normal approach
package Arrays.TwoPointers;

import java.util.Scanner;

public class ZeroesANDOnesSortApproachOne {

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swapZeroesAndOnes(int[] arr){
        int n=arr.length;
        int zeroes=0;
        //count number of zeroes 
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                zeroes++;
            }
        }
        //o to zeroes-1 : 0, zeroes to n-1 : 1
        for (int i = 0; i < n; i++) {
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }

    static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+"elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Orignal array:");
        printArray(arr);
        swapZeroesAndOnes(arr);
        System.out.println("Sorted Array");
        printArray(arr);

    }
}
