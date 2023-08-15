package Arrays.PrefixSum;

import java.util.Scanner;

public class QueriesPrefix {
    // static void printArray(int[] arr){

    //     for(int i=1;i<=arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    // static void maxPrefixSum(int[] arr){
    //     int n=arr.length;
    //     for (int i = 1; i < n; i++) {
    //         arr[i]+=arr[i-1];
    //     }
    // }
    static int[] maxPrefixSum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("Enter "+n+" elements");
        for (int i = 1; i <= n; i++) {
            arr[i]=sc.nextInt();
        }
        // int[] arr={2,4,1,3,6,5};
        // System.out.println("Orignal array:");
        // printArray(arr);
        int[] prefix=maxPrefixSum(arr);
        System.out.println("Enter number of queries:");
        int q=sc.nextInt();
        while (q-- >0) {
            System.out.println("Enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans=prefix[r]-prefix[l-1];
            System.out.println("Sum:"+ans);
        }
    }
}
