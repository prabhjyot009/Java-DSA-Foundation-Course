package Arrays.Sorting;

public class BubbleSort {

    static void bubble(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) { //i=0 to i=n-2
            //Comparing adjacent elements
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    // swap(arr, j, j+1);
                }
            }
        }
    }
    // static void swap(int[] arr, int i,int j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // }
    
    public static void main(String[] args) {
        int[] arr={3,7,9,2,5};
        bubble(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
