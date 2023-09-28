package GeekForGeeks;

import java.util.Arrays;

public class WaveArray {
    static void convertToWave(int arr[], int n){
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i+=2) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        convertToWave(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
