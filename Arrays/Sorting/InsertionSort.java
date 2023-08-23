package Arrays.Sorting;

public class InsertionSort {

    static void insertion(int[] arr){
         int n=arr.length;
        //we will start from 1 because
        //we beleive that i=0 index is sorted
        for (int i = 1; i < n; i++) {
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                //swap a[j],a[j-1]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,3,2,1,4};
        insertion(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
