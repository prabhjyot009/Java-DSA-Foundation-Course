package Arrays;
import java.io.*;
public class MajorityElement {

    static int majorityElement(int[] arr,int n){
        int max_freq=0;
        int index=-1;
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
            if (count>max_freq) {
                max_freq=count;
                index=i;
            }
        }
        if(max_freq>n/2){
            System.out.println(arr[index]+" "+max_freq);
        }
        else{
            System.out.println("No Majority Element");
        }
        return index;
    }
        public static void main(String[] args) {
        int[] arr={89,9,9,9,9,1,1};
        int n=arr.length;
        majorityElement(arr,n);
    }
}
