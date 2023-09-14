package Arrays;

import java.util.LinkedList;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 3, 6, 6 };
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                System.out.print(nums[i] + " ");
            } else {
                list.add(nums[i]);
            }
        }
    }
}