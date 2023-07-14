package Arrays;

public class SortedOrNot {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
    static void GreaterOccurrencesArr(int[] arr){
        int count=0;
        int target=5;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>target){
                count+=1;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr={5,1,8,5,9,8,0};
        System.out.println("Orignal Array:");
        printArray(arr);
        System.out.println("Greater occurences are:");
        GreaterOccurrencesArr(arr);
    }
}
