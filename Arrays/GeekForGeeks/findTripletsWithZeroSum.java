package Arrays.GeekForGeeks;

import java.util.Arrays;

public class findTripletsWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int n = arr.length;
        findTripletsWithZeroSum obj = new findTripletsWithZeroSum();
        boolean ans = obj.new Solution().findTriplets(arr, n);
        System.out.println(ans);
    }

    class Solution {
        public boolean findTriplets(int arr[], int n) {
            Arrays.sort(arr);
            for (int i = 0; i < n - 2; i++) {
                if (twoSum(arr, -arr[i], i + 1)) {
                    return true;
                }
            }
            return false;
        }

        public boolean twoSum(int[] arr, int x, int i) {
            int j = arr.length - 1;
            while (i < j) {
                if (arr[i] + arr[j] > x) {
                    j--;
                } else if (arr[i] + arr[j] < x) {
                    i++;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
