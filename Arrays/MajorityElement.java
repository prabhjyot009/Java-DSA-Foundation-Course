package Arrays;

import java.io.*;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String args[])
    {
        int[] nums={3,2,3};
        int val=nums[0];
        int count=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(count==0){
                val=nums[i];
                count=1;
            }
            else if(nums[i]==val){
                count+=1;
            }
            else{
                count--;
            }
        }
        System.out.println(val);
    }
}
