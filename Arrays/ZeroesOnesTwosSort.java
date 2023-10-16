package Arrays;

public class ZeroesOnesTwosSort {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void zotSort(int[] arr){
        int low=0,mid=1,high=2;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==mid){
                
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,1,0,0,2,1};
        System.out.println("Orignal Array");
        printArray(arr);
    }
}
