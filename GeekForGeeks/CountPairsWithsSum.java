package GeekForGeeks;

import java.util.Arrays;
import java.util.HashMap;

public class CountPairsWithsSum {
    public static void main(String[] args) {
        int[] arr={1,5,7,1};
        int target=6;
        System.out.println(countPairs(arr,target));
    }
    //using hashmaps O(n) time and O(n) space complexity
    static int countPairs(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i])){
                count+=map.get(target-arr[i]);
            }
            if(target-arr[i]==arr[i]){
                count--;
            }
        }
        return count/2;
    }
}