package Arrays.CsharpQuestions;

import java.util.Scanner;

public class SecondLargeSmall {

    static void sorting(int[] arr){
        int n=arr.length;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Kth Smallest and Largest values using logic are:");
        System.out.println(arr[2]+" "+arr[arr.length-3]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sorting(arr);
    }
}
