package Arrays.BinarySearch;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(binarySearch(arr));

    }
    static boolean binarySearch(int[] arr){
        int start=0;
        int target=3;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return true;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;   
    }
}
