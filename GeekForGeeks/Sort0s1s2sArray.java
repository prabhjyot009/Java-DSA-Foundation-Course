package GeekForGeeks;

public class Sort0s1s2sArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        int n = arr.length;
        Sort0s1s2sArray obj = new Sort0s1s2sArray();
        obj.new Solution().sort012(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    class Solution {
        public void sort012(int a[], int n) {
            int low = 0;
            int mid = 0;
            int high = n - 1;

            while (mid <= high) {
                if (a[mid] == 0) {
                    swap(a, low, mid);
                    low++;
                    mid++;
                } else if (a[mid] == 1) {
                    mid++;
                } else {
                    swap(a, mid, high);
                    high--;
                }
            }
        }

        public void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
