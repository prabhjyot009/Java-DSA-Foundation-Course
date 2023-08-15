package Arrays.PrefixSum;

public class BasicSuffixSumArray {
    
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //approach inplace
    static void maxSuffixSum(int[] arr){
        int n=arr.length-2;
        for (int i = n; i >=0; i--) {
            arr[i]+=arr[i+1];
        }
    }
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5};
        System.out.println("Orignal array:");
        printArray(arr);
        maxSuffixSum(arr);
        System.out.println("Max Suffix sum");
        printArray(arr);
    }
}
