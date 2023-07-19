package Arrays.ArrayManipulation;

public class RepeatingArray {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int repeatArray(int[] arr){
        int repeat=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]==arr[j]) {
                    repeat=arr[i];
                }
            }
        }
        System.out.println(repeat);
        return repeat;
    }
    public static void main(String[] args) {
        int[] arr={8,8,5,9,2,0};
        printArray(arr);
        repeatArray(arr);
    }
}
