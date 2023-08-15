package Arrays.TwoPointers;

public class EvenANDOddSort {
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void EvenOddSort(int[] a) {
        int n = a.length;
        int left = 0,right = n - 1;

        while (left<right) {
            if(a[left]%2==1 && a[right]%2==0){
                swap(a, left, right);
                left++;
                right--;
            }
            if (a[left]%2==0) {
                left++;
            }
            if (a[right]%2==1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println("Orignal array:");
        printArray(a);
        EvenOddSort(a);
        System.out.println("Sorted Array");
        printArray(a);
    }
}
