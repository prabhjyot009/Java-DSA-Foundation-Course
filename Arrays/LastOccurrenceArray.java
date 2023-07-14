package Arrays;

public class LastOccurrenceArray {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
    static void LastOccurrencesArr(int[] arr){
        int lastIndex=-1;
        int target=5;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                lastIndex=i;
            }
        }
        System.out.println(lastIndex);
    }
    public static void main(String[] args) {
        int[] arr={5,7,8,5,9,8,0};
        System.out.println("Orignal Array:");
        printArray(arr);
        System.out.println("Last occurences is:");
        LastOccurrencesArr(arr);
    }
}
