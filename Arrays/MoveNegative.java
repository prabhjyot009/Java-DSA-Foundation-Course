package Arrays;

public class MoveNegative {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void Move(int[] arr){
        int n=arr.length; 
        int j=0,temp;       
        for (int i = 0; i < n; i++) {
            if (arr[i]<0) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,-4,-3,0};
        System.out.println("Orignal array:");
        printArray(arr);
        System.out.println("New Array:");
        Move(arr);
    }
}
