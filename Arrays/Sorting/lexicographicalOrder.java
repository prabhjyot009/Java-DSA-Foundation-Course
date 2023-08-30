package Arrays.Sorting;

public class lexicographicalOrder {
    //Selection Sort
    public static void main(String[] args) {
        int[] arr={1,5,4,3,2,0};
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
            min_index=arr[i];
            arr[i]=temp;
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
