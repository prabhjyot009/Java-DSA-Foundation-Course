package Arrays.ArrayManipulation;

public class UniqueNumber {
    static void printSum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int uniqueNumber(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=-1){
                ans=arr[i];
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        printSum(arr);
        uniqueNumber(arr, 1);
    }
}
