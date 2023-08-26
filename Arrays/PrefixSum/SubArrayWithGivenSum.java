package Arrays.PrefixSum;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7};
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if (sum==12) {
                    System.out.println("Subarray found between "+i+" and "+j);
                    return;
                }
            }
        }
    }
}
