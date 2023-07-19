package Arrays.ArrayManipulation;

public class RepeatingArray {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int repeatArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={8,9,5,9,2,0};
        printArray(arr);
        System.out.println(repeatArray(arr));
    }
}
