package GeekForGeeks;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(binarySearch(arr));
        System.out.println(binarySearch1(arr));
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
    static int binarySearch1(int[] arr){
        int start=0;
        int target=3;
        int ans=-1;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(target==arr[mid]){
                ans=mid;
                return ans;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;   
    }
}
