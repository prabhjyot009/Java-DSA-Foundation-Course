package GeekForGeeks;

import java.util.ArrayList;

public class FirstAndLastOccurence {
    // Function for finding first and last occurrence of an elements
    // arr: input array

    public static ArrayList<Long> find(long arr[], int n, int x) {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        int start = 0;
        int end = n - 1;
        int first = -1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;// to avoid overflow
            if (x == arr[mid]) {
                first = mid;
                end = mid - 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        start = 0;
        end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;// to avoid overflow
            if (x == arr[mid]) {
                last = mid;
                start = mid + 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        list.add((long) first);
        list.add((long) last);
        return list;
    }

    public static void main(String[] args) {
        long[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int n = arr.length;
        int x = 5;
        System.out.println(find(arr, n, x));
    }
}

