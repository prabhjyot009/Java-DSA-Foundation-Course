package Arrays;
import java.util.Arrays;

public class kSmallestAndLargest {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int [] kSmallestAndLargestElement(int [] arr, int k){
        Arrays.sort(arr);
        int [] ans = {arr[k-1],arr[arr.length-k]};
        System.out.println("Sorted Array");
        printArray(arr);
        System.out.println(ans[0]+" "+ans[1]);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 5, 9, 8, 0 };
        System.out.println("Orignal Array:");
        printArray(arr);
        kSmallestAndLargestElement(arr,2);
    }
}

// import java.util.Arrays;
// import java.util.Scanner;

// public class kSmallestAndLargest {
//     public static int [] kSmallestAndLargestElement(int [] array, int k){
//         Arrays.sort(array);
//         int [] ans = {array[k-1],array[array.length-k]};
//         return ans;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Size of an Array: ");
//         int n = sc.nextInt();
//         System.out.println("Enter " + n + " elements");
//         int[] array = new int[n];
//         for (int i = 0; i < array.length; i++) {
//             array[i] = sc.nextInt();
//         }
//         System.out.println("Enter the Element k: ");
//         int k = sc.nextInt();
//         int [] ans = kSmallestAndLargestElement(array,k);
//         System.out.println(ans);
//         System.out.println(k + "th Smallest element is: " + ans[0]);
//         System.out.println(k + "th largest element is: " + ans[1]);
//     }
// }