package Arrays.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int x=24;
        int start=0;
        int end=x;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int val=mid*mid;
            if(val==x){
                System.out.println(mid);
            }
            else if(val>x){
                end=mid-1;
            }
            else{
                start=mid+1;
                ans=mid;
            }
        }
        System.out.println(ans);
    }
}
