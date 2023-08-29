package Arrays.Sorting;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr={5,0,6,1,0,3};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}