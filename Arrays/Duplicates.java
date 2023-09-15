package Arrays;

import java.util.LinkedList;

public class Duplicates {
    // public static void main(String[] args) {
    //     int[] nums = { 1, 2, 3, 1, 3, 6, 6 };
    //     LinkedList<Integer> list = new LinkedList<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (list.contains(nums[i])) {
    //             System.out.print(nums[i] + " ");
    //         } else {                                                
    //             list.add(nums[i]);
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 1, 3, 6, 6 };
        // int[] freq=new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     freq[arr[i]]++;
        // }
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]>1){
        //         System.out.print(i+" ");
        //     }
        // }

        //without using any extra space
        for(int i=0;i<arr.length;i++){
            int idx=Math.abs(arr[i]);
            if(arr[idx]<0){
                System.out.print(idx+" ");
            }else{
                arr[idx]=-arr[idx];
            }
        }
    }
}