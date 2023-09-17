public class SumArray {
    static int printSumArr(int[] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        int sum=printSumArr(arr, idx+1);
        return sum+arr[idx];
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9};
        System.out.println(printSumArr(arr, 0));
    }
}
