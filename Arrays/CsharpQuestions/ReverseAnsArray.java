package Arrays.CsharpQuestions;

public class ReverseAnsArray{

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] ansArray(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int j=0;
        int i=n-1;
        while(i>=0){
            ans[j++]=arr[i];
            i--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Orignal Array");
        printArray(arr);
        int[] ans=ansArray(arr);
        System.out.println("Reversed Array:");
        printArray(ans);
    }
}