package Arrays;

import java.io.*;
import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement1(int[] nums) {
        int n = nums.length;
        int majority = n/2;
        int[] count = new int[100];
        for(int num : nums){
            count[num]++;
            if(count[num] > majority){
                return num;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new MajorityElement().majorityElement1(arr)); 
        }
    }
}
