package Arrays.ArrayManipulation;

public class SecondLargestArray {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // static int findMax(int[] arr){
    //     int max=Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr.length-1; j++) {
    //             if (arr[j]>max) {
    //                 max=arr[j];
    //             }
    //         }
    //     }
    //     return max;
    // }
    //find second largest using O(n) time complexity
    // static void findSecondMax(int[] arr){
    //     int max=Integer.MIN_VALUE;
    //     int secondMax=Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i]>max) {
    //             secondMax=max;
    //             max=arr[i];
    //         }
    //         else if(arr[i]>secondMax && arr[i]!=max){
    //             secondMax=arr[i];
    //         }
    //         else{
    //             continue;
    //         }
    //     }
    //     System.out.println("Second Max: "+secondMax);
    // }
    // //for array 642 642 642 642 642 642 642 642 642 642 642 642 642 642 642 642 642 642 642 642 642
    // //input is 21
    // //output is -1
    // static void findSecondMax(int[] arr){
    //     int max=Integer.MIN_VALUE;
    //     int secondMax=Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i]>max) {
    //             secondMax=max;
    //             max=arr[i];
    //         }
    //         else if(arr[i]>secondMax && arr[i]!=max){
    //             secondMax=arr[i];
    //         }
    //         else{
    //             continue;
    //         }
    //     }
    //     if (secondMax==Integer.MIN_VALUE) {
    //         System.out.println("-1");
    //     }
    //     else{
    //         System.out.println("Second Max: "+secondMax);
    //     }
    // }
    //for array 269 269 269 269 269 269 269 183
    //input is 8
    //output is 183
    static void findSecondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
            else{
                continue;
            }
        }
        if (secondMax==Integer.MIN_VALUE) {
            System.out.println("-1");
        }
        else if(secondMax==max){
            System.out.println("-1");
        }
        else{
            System.out.println("Second Max: "+secondMax);

        }
    }

    public static void main(String[] args) {
        int[] arr={269,269,269,269,269,269,269,183};
        printArray(arr);
        findSecondMax(arr);
    }
}
