package Arrays.GeekForGeeks;

import java.util.Arrays;

public class CountPairsWithsSum {
    public static void main(String[] args) {
        int[] arr={1,5,7,1};
        System.out.println(countPairsWithsSum(arr));
    }
    //target 6 should return 2 provide me count of pairs whose sum is 6 code for output 2 is:
    static int countPairsWithsSum(int[] arr){
        int target=6;
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        System.out.println("Number of pairs with the given sum are: "+ans);
        return ans;
    }
}
