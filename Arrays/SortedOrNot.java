package Arrays;

public class SortedOrNot {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // static boolean isSorted(int[] arr) {
    //     boolean check = true;
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] > arr[i - 1]) {
    //             check = false;
    //             break;
    //         }
    //     }
    //     System.out.println(check);
    //     return check;
    // }

    static void sortedArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 5, 9, 8, 0 };
        System.out.println("Orignal Array:");
        printArray(arr);
        // isSorted(arr);
        System.out.println("Sorted Array:");
        sortedArray(arr);
    }
}
