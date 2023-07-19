package Arrays.ArrayManipulation;

public class SecondLargestArray {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void secondLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>max) {
                    max=arr[j];
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr={8,3,5,9,2,0};
        printArray(arr);
        secondLargest(arr);
    }
}
