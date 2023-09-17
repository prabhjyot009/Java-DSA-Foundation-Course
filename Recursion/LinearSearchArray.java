public class LinearSearchArray {
        static boolean printLinearArr(int[] arr,int n,int target,int idx){
            if(idx>=n) return false;    
            if(arr[idx]==target) return true;
            return printLinearArr(arr,n,target,idx+1);
        }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9};
        int target=6;
        if(printLinearArr(arr,arr.length, target, 0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
