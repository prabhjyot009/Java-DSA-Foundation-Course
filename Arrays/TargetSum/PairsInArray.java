package Arrays.TargetSum;

public class PairsInArray {
    static void printSum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void targetSum(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==x){
                    System.out.println("target"+arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,6,3,5,8,2};
        printSum(arr);
        targetSum(arr, 7);
    }
}
