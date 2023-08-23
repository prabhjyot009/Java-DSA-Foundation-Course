package Arrays.Sorting;

public class Practice {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int majorityElement(int[] arr){
        // int freq=0;
        // int element=0;
        // for (int i = 0; i < arr.length; i++) {
        //     int count=0;
        //     for (int j = 0; j < arr.length; j++) {
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count>freq){
        //         freq=count;
        //         element=arr[i];
        //     }
        // }
        // System.out.println("Element is "+element);
        // System.out.println("Frequency is "+freq);
        // return element;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,3};
        printArray(arr);
        majorityElement(arr);
    }
}
