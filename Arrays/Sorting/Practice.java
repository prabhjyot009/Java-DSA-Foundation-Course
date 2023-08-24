package Arrays.Sorting;

public class Practice {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void majorityElement(int[] arr){
        int freq=0;
        for (int i = 0; i < arr.length; i++) {
            int max=0;
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]==max){
                freq+=1;
            }
        }
        System.out.println(max);
        System.out.println(freq);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,3};
        printArray(arr);
        majorityElement(arr);
    }
}
