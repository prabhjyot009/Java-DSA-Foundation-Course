package GeekForGeeks.School;

import java.util.Arrays;

/**
 * median
 */
public class median {

    public static void main(String[] args) {

        int[] arr={56, 67, 30, 79};
        Arrays.sort(arr);
        int n= arr.length;
        int median=0;
        if (n%2==0) {
            median=(arr[n/2]+arr[(n/2)-1])/2;
        }
        else{
            median=(arr[n/2]);
        }
        System.out.println(median);
    }
}