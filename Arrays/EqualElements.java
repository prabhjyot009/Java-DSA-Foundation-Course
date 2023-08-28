package Arrays;

import java.util.Arrays;

public class EqualElements {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 2, 1, 3, 4 };
        for (int i = 0; i < arr2.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr2.length - i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                return;
            }
        }
        for (int i = 0; i < arr1.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                return;
            }
        }
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        boolean equal = true;

        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        } else {
            equal = false;
        }
        if (equal) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
