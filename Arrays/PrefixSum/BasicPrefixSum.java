package Arrays.PrefixSum;

public class BasicPrefixSum {

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // static int[] maxPrefixSum(int[] arr){
    //     int n=arr.length;
    //     int[] prefix=new int[n];
    //     prefix[0]=arr[0];
    //     for (int i = 1; i < n; i++) {
    //         prefix[i]=prefix[i-1]+arr[i];
    //     }
    //     return prefix;
    // }
    //approach inplace
    static void maxPrefixSum(int[] arr){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            arr[i]+=arr[i-1];
        }
    }
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5};
        System.out.println("Orignal array:");
        printArray(arr);
        maxPrefixSum(arr);
        System.out.println("Max Prefix sum");
        printArray(arr);
    }
}
