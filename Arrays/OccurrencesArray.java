package Arrays;

public class OccurrencesArray {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
    static void OccurrencesArr(int[] arr){
        int count=0;
        int target=5;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                count+=1;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr={5,7,8,5,9,8,0};
        System.out.println("Orignal Array:");
        printArray(arr);
        System.out.println("Number of occurences in an array are:");
        OccurrencesArr(arr);
    }
}
