package Arrays.ArrayManipulation;

/**
 * uniqueElements
 */
public class uniqueElements {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int unique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 3, 3 };
        System.out.println("Orrignal Array:");
        printArray(arr);
        unique(arr);
    }
}