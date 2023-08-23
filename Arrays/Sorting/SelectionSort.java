package Arrays.Sorting;

public class SelectionSort {

    static void selection(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index=i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;}
        }
        System.out.println("Sorted Array");
    }
    public static void main(String[] args) {
        int[] arr={5,3,2,1,4};
        selection(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
