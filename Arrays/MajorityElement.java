package Arrays;
import java.io.*;
public class MajorityElement {

    static void majorityElement(int[] arr,int n){
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
            System.out.println(arr[index]);
        }
        else{
            System.out.println("Eroror");
        }
        
            
    }
        public static void main(String[] args) {
        int[] arr={5,6,3,3,1,1,2,89,1,1,0,3};
        int n=arr.length;
        majorityElement(arr,n);
    }
}
