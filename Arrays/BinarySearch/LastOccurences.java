package Arrays.BinarySearch;

public class LastOccurences {
    static int lastoccur(int[] arr,int x){
        int start=0;
        int end=arr.length-1;
        int freq=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(x==arr[mid]){
                freq=mid;
                start=mid+1;
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return freq;
    }
    public static void main(String[] args) {
        int[] arr={2,5,5,5,6,6,8,9,9,9};
        int x=6;
        System.out.println(lastoccur(arr, x));
    }
}

