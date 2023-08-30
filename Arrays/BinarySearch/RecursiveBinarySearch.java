package Arrays.BinarySearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(binarySearch(arr, 0, 0, -2));

    }

    static boolean binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return false;
        }
        int mid = (start + end) / 2;
        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return binarySearch(arr, start, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, end, target);
        }
    }
}
