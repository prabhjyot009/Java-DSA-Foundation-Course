package Arrays.BinarySearch;

public class SortedRotation {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[n-1]){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
}
