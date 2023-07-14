package Arrays;

import java.util.Arrays;

public class SmallestLargestArray {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void SmallLargeArrayUsingLogic(int[] arr) {
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
        System.out.println("Smallest and Largest values using logic are:");
        System.out.println(arr[0]+" "+arr[arr.length-1]);
    }
    static int[] SmallestLargestArrayUsingFunction(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        System.out.println(arr[0]+" "+arr[arr.length-1]);
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 5, 9, 8, 0 };
        System.out.println("Orignal Array:");
        printArray(arr);
        SmallLargeArrayUsingLogic(arr);
        System.out.println("Smallest and Largest values using function are:");
        SmallestLargestArrayUsingFunction(arr);
    }
}
