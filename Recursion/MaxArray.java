public class MaxArray {
    static int printMaxArr(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAns=printMaxArr(arr, idx+1);
        return Math.max(arr[idx], smallAns);
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9};
        System.out.println(printMaxArr(arr, 0));
    }
}
