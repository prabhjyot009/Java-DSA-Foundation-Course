public class SortedOrNot {
    static int sorted(int[] arr,int n,int idx){
        if(idx==n-1){
            return 1;
        }
        if(arr[idx]>arr[idx+1]){
            return 0;
        }
        else{
            return sorted(arr,n,idx+1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(sorted(arr,arr.length,0));
    }
}
