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
        for(int i=0;i<arr.length;i++){ //marking the visited elements as negative 
            int idx=Math.abs(arr[i]); //taking the absolute value of the element as index because the element can be negative also like -1
            if(arr[idx]<0){//if the element is already negative then it is a duplicate
                System.out.print(idx+" ");//printing the duplicate element
            }else{//if the element is not negative then marking it as negative
                arr[idx]=-arr[idx];//marking the element as negative for example if the element is 1 then arr[1]=-1 and if the element is 2 then arr[2]=-2 and so on 
            }
        }
    }
}