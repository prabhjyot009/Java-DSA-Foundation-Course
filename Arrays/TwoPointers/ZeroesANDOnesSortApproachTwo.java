package Arrays.TwoPointers;

public class ZeroesANDOnesSortApproachTwo {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swapZeroesAndOnesTWO(int[] arr) {
        int n = arr.length;
        int left = 0,right = n - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 1, 0, 0, 1, 1, 0 };
        System.out.println("Orignal array:");
        printArray(arr);
        swapZeroesAndOnesTWO(arr);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}
