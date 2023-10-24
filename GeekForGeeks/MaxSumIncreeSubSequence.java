package GeekForGeeks;

import java.util.Arrays;

public class MaxSumIncreeSubSequence {
    public static void printArrray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int maxSum(int[] arr) {
        int n = arr.length;
        int[] msis = new int[n];
        msis[0]=arr[0];
        int result=msis[0];
        for (int i = 1; i < n; i++) {
            msis[i] = arr[i];

            for (int j = 0; j < i; j++) {
                if(arr[i]>arr[j] && msis[i]<msis[j]+arr[i]){
                     msis[i]=msis[j]+arr[i];
                }
            }
            result=Math.max(result, msis[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 101, 2, 3, 100 };
        System.out.println("Orignal Array: ");
        printArrray(arr);
        System.out.println(maxSum(arr));
    }
}
