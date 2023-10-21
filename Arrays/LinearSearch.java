package Arrays;

public class LinearSearch {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int linearsearch(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        int ans=0       ;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=arr[mid];
                return ans;
            }
            else if(k<arr[mid]){
                high--;
            }
            else{
                low++;
            }

        }
                            return ans;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        int n=arr.length;
        System.out.println("Orignal Array:");
        printArray(arr);
        
        System.out.println(linearsearch(arr, k));
    }
}
