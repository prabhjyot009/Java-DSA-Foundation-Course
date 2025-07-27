// package GeekForGeeks;

// import java.util.Arrays;

// public class SecondLargestElement {
//     static void printarray(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     static void removeDuplicates(int[] arr){
//         for(int i=0;i<arr.length;i++){ 
//             int idx=Math.abs(arr[i]);
//             if(arr[idx]<0){
//                 System.out.print(idx+" ");
//             }else{
//                 arr[idx]=-arr[idx];
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={12,2,3,4,12};
//         printarray(arr);
//         Arrays.sort(arr);
//         removeDuplicates(arr);
//         int secondlargest=arr[arr.length-2];
//         System.out.println(secondlargest);
//     }
// }
package GeekForGeeks;

public class SecondLargestElement {
    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            return -1;
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 4, 12};
        printarray(arr);
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);
    }
}