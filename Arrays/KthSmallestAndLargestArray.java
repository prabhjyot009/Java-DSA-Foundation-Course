package Arrays;

import java.util.Arrays;

public class KthSmallestAndLargestArray {
        static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void KthSmallLargeArrayUsingLogic(int[] arr) {
        int temp=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        printArray(arr);
        System.out.println("Kth Smallest and Largest values using logic are:");
        System.out.println(arr[1]+" "+arr[arr.length-2]);
    }
    static int[] SmallestLargestArrayUsingFunction(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        System.out.println(arr[2]+" "+arr[arr.length-3]);
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 5, 9, 8, 0 };
        System.out.println("Orignal Array:");
        printArray(arr);
        KthSmallLargeArrayUsingLogic(arr);
        System.out.println("Kth Smallest and Largest values using function are:");
        SmallestLargestArrayUsingFunction(arr);
    }
}
