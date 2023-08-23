package Arrays.Sorting;

public class OptimizedBubbleSort {
    static void bubble(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) { //i=0 to i=n-2
            boolean flag=false; //has any swap happened
            //Comparing adjacent elements
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true; //some swap has happened
                }
            }
            if(flag == false){// have any swaps happen
                return;
            } 
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5};
        bubble(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
