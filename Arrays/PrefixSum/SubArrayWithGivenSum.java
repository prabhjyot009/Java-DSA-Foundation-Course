package Arrays.PrefixSum;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
//use 1 based indexing
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int sum = s;
        int currentSum = 0;
        int start = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            while (currentSum > sum) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == sum) {
                ans.add(start+1);
                ans.add(i+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }

}

 
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int n = arr.length;
        int s = 12;
        SubArrayWithGivenSum obj = new SubArrayWithGivenSum();
        ArrayList<Integer> ans = obj.new Solution().subarraySum(arr, n, s);
        System.out.println(ans);
}
}