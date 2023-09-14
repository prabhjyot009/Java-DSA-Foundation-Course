package Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 3, 6, 6 };
        int[] hash = new int[7];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
