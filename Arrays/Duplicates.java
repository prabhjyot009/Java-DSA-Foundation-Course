package Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 3, 6, 6 };
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int index = nums[i] % n;
            if (nums[index] >= n) {
                System.out.println(index);
            } else {
                nums[index] += n;
            }
        }
    }
}
