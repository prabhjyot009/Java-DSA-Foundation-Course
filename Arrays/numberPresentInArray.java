package Arrays;

import java.util.Scanner;

public class numberPresentInArray {

    static int[] makeFrequencyArray(int[] arr){
        int[] freq=new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+ n +" elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int[] freq=makeFrequencyArray(arr);
        System.out.println("Enter number of queries:");
        int q=sc.nextInt();

        while (q>0) {
            System.out.println("ENter number to be searched");
        }
    }
}
