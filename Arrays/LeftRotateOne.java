package Arrays;

import java.util.*;
class LeftRotateByOneArray
{
    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void leftRotateOne(int[] arr)
    {
        int temp = arr[0];
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            arr[i] = arr[i + 1];
            System.out.println(arr[i]);
        }
        arr[n - 1] = temp;
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Orignal Array");
        printArray(arr);
        System.out.println("New Array:");
        leftRotateOne(arr);
    }
}