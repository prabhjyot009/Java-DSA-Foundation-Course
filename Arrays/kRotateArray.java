package Arrays;

public class kRotateArray {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] kRotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for (int i = n-k; i < n; i++) {
            ans[j++]=arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++]=arr[i];
        }
        printArray(ans);
        return ans; 
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        printArray(arr);
        kRotate(arr, 2);
    }
}
