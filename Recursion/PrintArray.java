import java.util.Scanner;

public class PrintArray {
    static void printArr(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");         
        printArr(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr={5,4,2,3};
        printArr(arr,0);
    }
}
