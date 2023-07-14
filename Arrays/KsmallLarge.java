package Arrays;
import java.util.Arrays;

public class KsmallLarge {

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int[] uniqueArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueArr[j++] = arr[i];
            }
        }
        uniqueArr[j++] = arr[arr.length - 1];
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = uniqueArr[i];
        }
        return result;
    }

    public static int [] kSmallestAndLargestElement(int [] uniqueArr, int k){
        Arrays.sort(uniqueArr);
        int [] ans = {uniqueArr[k-1],uniqueArr[uniqueArr.length-k]};

        System.out.println(ans[0]+" "+ans[1]);
        return ans;
    }


        public static void main(String[] args) {
        int[] arr = {5, 1, 8, 5, 9, 8, 0};
        int k = 3;
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Kth Smallest and Largest: ");
        kSmallestAndLargestElement(uniqueArr,k);
    }
}