package GeekForGeeks;

public class MisingAndRepeating {
    static void printArray(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void findTwoElements(int[] arr,int n){
        int repeating=0;
        int missing=0;
        for (int i = 0; i < n; i++) {
            int idx=Math.abs(arr[i]);
            if(arr[idx]>0){
                arr[idx]=-arr[idx];
            }
            else{
                repeating=arr[idx];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                missing=i+1;
            }
        }
        System.out.println("repeating: "+repeating+" missing: "+missing);
    }
    public static void main(String[] args) {
        int[] arr={2,2,1};
        int n=arr.length;
        System.out.println("orignal array:");
        printArray(arr, n);
        findTwoElements(arr, n);
        System.out.println("after finding repeating and missing elements:");
        printArray(arr, n);
    }
}
