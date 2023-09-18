package GeekForGeeks;

public class SmallestPositiveGivenNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        SmallestPositiveGivenNumber obj = new SmallestPositiveGivenNumber();
        int ans = obj.new Solution().missingNumber(arr, arr.length);
        System.out.println(ans);
    }

    class Solution {
        int missingNumber(int arr[], int size) {
            int i = 0;
            while (i < size) {
                if (arr[i] > 0 && arr[i] <= size && arr[i] != arr[arr[i] - 1]) {
                    swap(arr, i, arr[i] - 1);
                } else {
                    i++;
                }
            }

            for (i = 0; i < size; i++) {
                if (arr[i] != i + 1) {
                    return i + 1;
                }
            }

            return size + 1;
        }

            public void swap(int[] a, int i, int j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            } 
    }
}
