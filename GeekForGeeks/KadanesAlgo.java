package GeekForGeeks;

public class KadanesAlgo {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        int n = arr.length;
        KadanesAlgo obj = new KadanesAlgo();
        int ans = obj.new Solution().maxSubarraySum(arr, n);
        System.out.println(ans);
    }

    class Solution {
        int maxSubarraySum(int arr[], int n) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int i = 0; i < n; i++) {
                currentSum += arr[i];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                if (currentSum < 0) {
                    currentSum = 0;
                }
            }

            return maxSum;
        }
    }
}
