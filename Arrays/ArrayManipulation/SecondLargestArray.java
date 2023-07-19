package Arrays.ArrayManipulation;

public class SecondLargestArray {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>max) {
                    max=arr[j];
                }
            }
        }
        return max;
    }
    static int findSecondMax(int[] arr){
        int max=findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        System.out.println(secondMax);
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr={8,3,5,9,2,0};
        printArray(arr);
        findMax(arr);
        findSecondMax(arr);
    }
}
