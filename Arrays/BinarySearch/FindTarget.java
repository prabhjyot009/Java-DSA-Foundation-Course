package Arrays.BinarySearch;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=3;
        int ans=0;
        boolean check=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                ans=i;
                check=true;
            }
        }
        if(check==true){
            System.out.println(ans);
        }
    }
}
