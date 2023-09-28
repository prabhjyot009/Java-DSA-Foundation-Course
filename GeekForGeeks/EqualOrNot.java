package GeekForGeeks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EqualOrNot {
    static boolean check(long[] arr1,long[] arr2){
        long arr1Length=arr1.length;
        long arr2Length=arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==arr2[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        long[] arr1={1,2,5,4,0};
        long[] arr2={2,4,5,0,1};
        System.out.println("Output:");
        if(check(arr1,arr2)){
        }
        else{
        }
    }
}
