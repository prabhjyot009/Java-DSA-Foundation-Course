package Arrays.GeekForGeeks;

public class MissingNumberInArray {
    static int MissingNumber(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += array[i];
        }
        int total = (n * (n + 1)) / 2;
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int n = arr.length;
        System.out.println(MissingNumber(arr, n));
    }
}
